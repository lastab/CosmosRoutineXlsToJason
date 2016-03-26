package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class main {


	public static void main(String[] args) {

		ConstantValues cval =new ConstantValues();
		try{
			FileInputStream fis= new FileInputStream(new File("FINALL1.xls") );

			//create workbook
			HSSFWorkbook wb= new HSSFWorkbook(fis);

			//create a sheet object to retrieve teh sheet
			HSSFSheet sheet= wb.getSheet("ALL Semester");

			PeriodDetails[] pd =new PeriodDetails[9];
			FacultyForDay ffd= new FacultyForDay();
			//int year=0;//first year


			
			JSONObject[] jobjroutine=new JSONObject[7];
			JSONObject[] jobjyear =new JSONObject[4];
			JSONObject[] jobjfaculties=new JSONObject[10];
			JSONArray[] jarrayyear=new JSONArray[7];
			JSONArray[] jarrayfaculty=new JSONArray[4];
			JSONArray jarraymain=new JSONArray();
			

			for (int day=0;day<7;day++){
				jarrayyear[day]=new JSONArray();
				for (int year=0;year<4;year++){
					jarrayfaculty[year]=new JSONArray();
					for (int j=0;j<cval.no_of_groups_in_year[year];j++){
						jobjfaculties[j]=new JSONObject();
						pd=PeriodDetails.getAllPeriodsOfDay(sheet, year,cval.batch[year][j], cval.getday(day));
						jobjfaculties[j].put("faculty", cval.batch[year][j]);
						jobjfaculties[j].put("subjects",pd[0].subject+","+pd[1].subject+","+pd[2].subject+","+pd[3].subject+","+pd[4].subject+","+pd[5].subject+","+pd[6].subject+","+pd[7].subject+","+pd[8].subject );
						jobjfaculties[j].put("teacher",pd[0].teacher+","+pd[1].teacher+","+pd[2].teacher+","+pd[3].teacher+","+pd[4].teacher+","+pd[5].teacher+","+pd[6].teacher+","+pd[7].teacher+","+pd[8].teacher );
						jobjfaculties[j].put("room",pd[0].room+","+pd[1].room+","+pd[2].room+","+pd[3].room+","+pd[4].room+","+pd[5].room+","+pd[6].room+","+pd[7].room+","+pd[8].room);
						jobjfaculties[j].put("type",pd[0].type+","+pd[1].type+","+pd[2].type+","+pd[3].type+","+pd[4].type+","+pd[5].type+","+pd[6].type+","+pd[7].type+","+pd[8].type);
						jarrayfaculty[year].add(jobjfaculties[j]);
//						System.out.println(jobjfaculties[j].toString());
						

					}

					jobjyear[year]=new JSONObject();							
					jobjyear[year].put("year", year);
					jobjyear[year].put("faculties", jarrayfaculty[year]);					
					jarrayyear[day].add(jobjyear[year]);
					//System.out.println("\n");
				}
				jobjroutine[day]=new JSONObject();
				jobjroutine[day].put("Day", day);
				jobjroutine[day].put("years", jarrayyear[day]);
				jarraymain.add(jobjroutine[day]);
			}
			String data_to_write="{\"routine\":"+jarraymain.toString()+"}";
			
			//writing a json file
			PrintWriter writer = new PrintWriter("routine.json", "UTF-8");			
			writer.println(data_to_write);
			System.out.print("file write complete");
			writer.close();
			

			//closing files
			wb.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


