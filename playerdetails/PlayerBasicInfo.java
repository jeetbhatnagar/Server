package com.rfc.playerdetails;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rfc.pojo.PlayerDetails;

public class PlayerBasicInfo {

	public PlayerBasicInfo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("inside main");
		PlayerBasicInfo obj=new PlayerBasicInfo();
		//obj.readPlayerDetails("C:\\Users\\Chandra Kumar 7\\Desktop\\RFC\\playerInfonew.xlsx");
		PlayerDetails obj1=new PlayerDetails("jeet", "23", "mid", "8454841373", "jeet.bhatangar@gmail.com", "8454841372", "reliance", "jio", "palyed for relaince");
		obj.writePlayerDetails("C:\\Users\\Chandra Kumar 7\\Desktop\\RFC\\playerInfonew.xlsx", obj1);

	}
	
	public  ArrayList<PlayerDetails> readPlayerDetails(String fileName)
	{
		 
		System.out.println(fileName);
		ArrayList<PlayerDetails> arrlstPlayerInfo=null;
		   try
		   {
			   arrlstPlayerInfo=new ArrayList<>();
			  
		XSSFWorkbook  workbook = new XSSFWorkbook(new 
				FileInputStream(fileName));
		   
		 
		  
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    
		 

		    //Iterate through each rows from first sheet
		    Iterator<Row> rowIterator = sheet.iterator();
		    int rowCount=0;
		    while(rowIterator.hasNext()) {
		        Row row = rowIterator.next();
		        
		        if(rowCount>=2)
		        {
		        	
		        	String playerName="";
		        	String age="";
		        	String playingPosition="";
		        	String mobileNo="";
		        	String emailId="";
		        	String whatsappNo="";
		        	String company="";
		        	String department="";
		        	String achivement="";
		        	
		        	
		    
		        Cell cell =row.getCell(0);
		        
		        if(cell!=null)
				{
					cell.setCellType(XSSFCell.CELL_TYPE_STRING);
					if(!cell.getStringCellValue().isEmpty())
					{
						playerName=cell.getStringCellValue().trim();
					
					}
				}
		        
	
		    Cell cell2 =row.getCell(1);
		        
	       if(cell2!=null)
			{
	    	   cell2.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell2.getStringCellValue().isEmpty())
				{
					age=cell2.getStringCellValue().trim();
				
				}
			}
		        
	
	       
	      Cell cell3 =row.getCell(2);
		        
	     if(cell3!=null)
			{
	    	 cell3.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell3.getStringCellValue().isEmpty())
				{
					playingPosition=cell3.getStringCellValue().trim();
				
				}
			}
	     
	     

	      Cell cell4 =row.getCell(3);
		        
	     if(cell4!=null)
			{
	    	 cell4.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell4.getStringCellValue().isEmpty())
				{
					mobileNo=cell4.getStringCellValue().trim();
				
				}
			}
	     
	     
	     Cell cell5 =row.getCell(4);
	        
	     if(cell5!=null)
			{
	    	 cell5.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell5.getStringCellValue().isEmpty())
				{
					emailId=cell5.getStringCellValue().trim();
				
				}
			}
	     
	     
	     Cell cell6 =row.getCell(5);
	        
	     if(cell6!=null)
			{
	    	 cell6.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell6.getStringCellValue().isEmpty())
				{
					whatsappNo=cell6.getStringCellValue().trim();
				
				}
			}
	     
	     Cell cell7 =row.getCell(6);
	        
	     if(cell7!=null)
			{
	    	 cell7.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell7.getStringCellValue().isEmpty())
				{
					company=cell7.getStringCellValue().trim();
				
				}
			}
	     Cell cell8 =row.getCell(7);
	        
	     if(cell8!=null)
			{
	    	 cell8.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell8.getStringCellValue().isEmpty())
				{
					department=cell8.getStringCellValue().trim();
				
				}
			}
	     Cell cell9 =row.getCell(8);
	        
	     if(cell9!=null)
			{
	    	 cell9.setCellType(XSSFCell.CELL_TYPE_STRING);
				if(!cell9.getStringCellValue().isEmpty())
				{
					achivement=cell9.getStringCellValue().trim();
				
				}
			}
	     
	     System.out.println("playername="+playerName+",age="+age+",playingposition="+playingPosition+",mobileno="+mobileNo+",emailid="+emailId+",whatsappno="+whatsappNo+",company="+company+",department="+department+",achivement="+achivement);
	     arrlstPlayerInfo.add(new PlayerDetails(playerName, age, playingPosition, mobileNo, emailId, whatsappNo, company, department, achivement));
	            
		      
		        
		    }
		        else
		      {
		        	rowCount++;
		       }
		        
		    }
		   
		      
		    
	
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   
		   return arrlstPlayerInfo;
		   }


	public  boolean writePlayerDetails(String fileName,PlayerDetails playerDetailPojo)
	{
		 
		System.out.println(fileName);
		boolean isWriteSuccess=true;
		
		   try
		   {
			   
			   FileInputStream filestream=new 
						FileInputStream(fileName);
			  
		XSSFWorkbook  workbook = new XSSFWorkbook(filestream);
		   

		  
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    int lastRowNo=sheet.getLastRowNum();
		    Row row=sheet.createRow(lastRowNo+1);

		       System.out.println("lastRowNo="+lastRowNo); 	
		        	
		    
		        Cell cell =row.createCell(0);
		        
		        cell.setCellValue(playerDetailPojo.getName());
		       
		    Cell cell2 =row.createCell(1);
		    cell2.setCellValue(playerDetailPojo.getAge());    
	           
	
	       
	      Cell cell3 =row.createCell(2);
	      cell3.setCellValue(playerDetailPojo.getPlayingPositon());      
	      

	      Cell cell4 =row.createCell(3);
	      cell4.setCellValue(playerDetailPojo.getMobileNo());
	     Cell cell5 =row.createCell(4);
	     cell5.setCellValue(playerDetailPojo.getEmailId());     
	      
	     
	     Cell cell6 =row.createCell(5);
	     cell6.setCellValue(playerDetailPojo.getWhatsappNo()); 
	      
	     Cell cell7 =row.createCell(6);
	     cell7.setCellValue(playerDetailPojo.getCompany());  
	      Cell cell8 =row.createCell(7);
	      cell8.setCellValue(playerDetailPojo.getDepartment());
	      Cell cell9 =row.createCell(8);
	      cell9.setCellValue(playerDetailPojo.getAchivement()); 
	    
			workbook.write(new FileOutputStream(fileName));
		    
	      filestream.close();
		   }
		   catch(Exception ex)
		   {
			   isWriteSuccess=false;
			   ex.printStackTrace();
		   }
		return isWriteSuccess;
		   
		   //return arrlstPlayerInfo;
		   }


	
	
	
}
