package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class2 {
	
	public static void main(String[] args) throws BiffException, IOException 
	{
	File f=new File("C:\\Users\\Dell\\Desktop\\dc.xls"); // connection 
        System.out.println("file changes");	
	Workbook wk=Workbook.getWorkbook(f);  // workbook object
	
	Sheet ws=wk.getSheet(0); // sheet object
	
	int r=ws.getRows();  // total rows
	int c=ws.getColumns(); // total columns
	
	for(int i=0;i<r;i++)  // loop for row
	{
		for(int j=0;j<c;j++)  // loop for column
		{
			Cell c1=ws.getCell(j, i);  // cell object
			System.out.println(c1.getContents()); // fetch the data
		
		}
	}
	
	
	
	
		
	}
	
}
