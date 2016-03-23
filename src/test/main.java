package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream.GetField;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;


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
			
			int year=2;//first year
			
			
			pd=PeriodDetails.getAllPeriodsOfDay(sheet, year,"BCV-B", cval.getday(3));
			
			for (int i=0;i<9;i++){
				if (pd[i].getSubject()!="")
					System.out.println(pd[i].getSubject());
				else 
					System.out.println("No Period");
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


