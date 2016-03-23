package test;

import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



public class PeriodDetails{
	public String subject,teacher,type,room;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	
	public static PeriodDetails[] getAllPeriodsOfDay(HSSFSheet sheet,int year,String group, int day){
		ConstantValues cv= new ConstantValues();
		String[] gropus_of_sem=new String[10];
				
		gropus_of_sem=cv.batch[year-1];
		int index=-1;
		for (int i=0;i<gropus_of_sem.length;i++) {
		    if (gropus_of_sem[i].equals(group)) {
		        index = i;
		        break;
		    }
		}
		int group_number=index;
		
		System.out.println("year="+year+"group="+group+" g:"+group_number);
				
				
				
				
		PeriodDetails[] pd= new  PeriodDetails[9];//9 as 9 periods a day
		for (int i=0;i<9;i++){
			pd[i]=getPeriodDetails(sheet, year, day+i*3,group_number);
		}
		return pd;
	}
	
	public  static PeriodDetails getPeriodDetails(HSSFSheet sheet,int year, int period_of_day,int group_number){
				
		ConstantValues cv= new ConstantValues();
		int sem_start=cv.sem_start[year-1];
		if (sem_start==cv.sem_start[0])//first year starts at 10 ... others at 7
			period_of_day+=12;
		int x=sem_start+group_number*cv.GROUP_LENGTH;
		int y=period_of_day;
		PeriodDetails pd= new PeriodDetails();
		Row r=sheet.getRow(y);
		Cell c=r.getCell(x);
		/*if (c.toString().equals(""))
			return null;*/
		pd.setSubject(c.toString());
		
		r=sheet.getRow(y+1);
		c=r.getCell(x);
		pd.setTeacher(c.toString());
		
		r=sheet.getRow(y+2);
		c=r.getCell(x);
		pd.setType(c.toString());
		
		r=sheet.getRow(y+2);
		c=r.getCell(x+1);
		pd.setRoom(c.toString());
		
		return pd;
	}
	
	
}
