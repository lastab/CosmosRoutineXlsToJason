package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream.GetField;

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
			int year=0;//first year


			

			
			JSONObject jobj =new JSONObject();
			JSONArray jarray=new JSONArray();

			
			for (int j=0;j<cval.no_of_groups_in_year[year];j++){
				for (int i=0;i<7;i++){
				
					pd=PeriodDetails.getAllPeriodsOfDay(sheet, year,cval.batch[year][j], cval.getday(i));
					jobj.put("subjects",pd[0].subject+","+pd[1].subject+","+pd[2].subject+","+pd[3].subject+","+pd[4].subject+","+pd[5].subject+","+pd[6].subject+","+pd[7].subject+","+pd[8].subject );
					jobj.put("teacher",pd[0].teacher+","+pd[1].teacher+","+pd[2].teacher+","+pd[3].teacher+","+pd[4].teacher+","+pd[5].teacher+","+pd[6].teacher+","+pd[7].teacher+","+pd[8].teacher );
					jobj.put("room",pd[0].room+","+pd[1].room+","+pd[2].room+","+pd[3].room+","+pd[4].room+","+pd[5].room+","+pd[6].room+","+pd[7].room+","+pd[8].room);
					jobj.put("type",pd[0].type+","+pd[1].type+","+pd[2].type+","+pd[3].type+","+pd[4].type+","+pd[5].type+","+pd[6].type+","+pd[7].type+","+pd[8].type);
					
					System.out.println(jobj.toJSONString());				
				}
				System.out.println("\n");
			}
			
/*				if (pd[i].getSubject()!="")
					System.out.println(pd[i].getSubject());
				else 
					System.out.println("No Period");*/
				

				
				
//			}

			//closing files
			wb.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
















}


