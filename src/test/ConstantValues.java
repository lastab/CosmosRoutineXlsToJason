package test;

import java.awt.List;
import java.util.ArrayList;

public class ConstantValues {

	//-1 because starts from[0][0] on spread sheet
	
	public   final int DAY_START=7-1;			
	public   final int GROUP_LENGTH=3;
	public   final int PERIOD_LENGTH=3;
	public   final int DAY_LENGTH=39;
	public   final int MAX_PERIOD=9;
	//ArrayList<ArrayList<String>> batch1 = new ArrayList<ArrayList<String>>();
	
	public   String[][] batch =new String[4][10];
	public   int[] sem_start= new int[4];
	public int[] no_of_groups_in_year = new int [4];
	
	public int getday(int daynumber){
		return (DAY_START+DAY_LENGTH*daynumber);
	}

	public ConstantValues(){
		
	/*	ArrayList<String> groups=new ArrayList<String>();
		batch1.clear();
		groups.add("BCV-A");
		groups.add("BCV-B");
		groups.add("BCV-C");
		groups.add("BCV-D");
		groups.add("BEIT-A");
		groups.add("BEX-B");
		groups.add("BCE-A");
		batch1.add(groups);
		groups.clear();
		
		groups.add("BCV-A");
		groups.add("BCV-B");
		groups.add("BCV-C");
		groups.add("BCV-D");
		groups.add("BEIT-A");
		groups.add("BEIT-B");
		groups.add("BEX-A");
		groups.add("BCE-A");
		groups.add("BCE-B");
		batch1.add(groups);

		groups.clear();
		
		groups.add("BCV-A");
		groups.add("BCV-B");
		groups.add("BCV-C");
		groups.add("BCV-D");
		groups.add("BEIT-A");
		groups.add("BEIT-B");
		groups.add("BEX-A");
		groups.add("BEX-B");
		groups.add("BCE-A");
		groups.add("BCE-B");
		batch1.add(groups);

		groups.clear();
		
		groups.add("BCV-A");
		groups.add("BCV-B");
		groups.add("BCV-C");
		groups.add("BCV-D");
		groups.add("BEIT-A");
		groups.add("BEIT-B");
		groups.add("BEX-A");
		groups.add("BEX-B");
		groups.add("BCE-A");
		groups.add("BCE-B");
		batch1.add(groups);

		groups.clear();		
		*/
		
		
		
		sem_start[0]=26*0+10-1;
		sem_start[1]=26*1+11-1;
		sem_start[2]=26*2+18-1;
		sem_start[3]=26*4+2-1;
		
		no_of_groups_in_year[0]=8;
		no_of_groups_in_year[1]=9;
		no_of_groups_in_year[2]=10;
		no_of_groups_in_year[3]=10;


		batch[0][0]="BCV-A";
		batch[0][1]="BCV-B";
		batch[0][2]="BCV-C";
		batch[0][3]="BCV-D";
		batch[0][4]="BEIT-A";
		batch[0][5]="BEIT-B";
		batch[0][6]="BEX-B";
		batch[0][7]="BCE-A";		
		batch[0][8]=null;
		batch[0][9]=null;

		batch[1][0]="BCV-A";
		batch[1][1]="BCV-B";
		batch[1][2]="BCV-C";
		batch[1][3]="BCV-D";
		batch[1][4]="BEIT-A";
		batch[1][5]="BEIT-B";
		batch[1][6]="BEX-A";
		batch[1][7]="BCE-A";
		batch[1][8]="BCE-B";
		batch[0][9]=null;

		batch[2][0]="BCV-A";
		batch[2][1]="BCV-B";
		batch[2][2]="BCV-C";
		batch[2][3]="BCV-D";
		batch[2][4]="BEIT-A";
		batch[2][5]="BEIT-B";
		batch[2][6]="BEX-A";
		batch[2][7]="BEX-B";
		batch[2][8]="BCE-A";
		batch[2][9]="BCE-B";

		batch[3][0]="BCV-A";
		batch[3][1]="BCV-B";
		batch[3][2]="BCV-C";
		batch[3][3]="BCV-D";
		batch[3][4]="BEIT-A";
		batch[3][5]="BEIT-B";
		batch[3][6]="BEX-A";
		batch[3][7]="BEX-B";
		batch[3][8]="BCE-A";
		batch[3][9]="BCE-B";
	}

}
