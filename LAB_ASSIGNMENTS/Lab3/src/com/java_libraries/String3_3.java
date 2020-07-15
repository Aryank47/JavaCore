package com.java_libraries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class String3_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("\n--- Duration.between --- ");

	        LocalDateTime oldDate = LocalDateTime.of(2020, Month.MARCH, 31, 10, 20, 55);
	        LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);
	        LocalDateTime systemDate=LocalDateTime.now();
	        
	        System.out.println("System Date :"+systemDate);
	        System.out.println("Old Date :"+oldDate);
	        System.out.println("New Date :"+newDate);

	        
	        //3.3
	        Duration duration1 = Duration.between(oldDate, systemDate);
	        System.out.println();
	        System.out.println("Difference between Old date "+oldDate+" and system date "+systemDate+" in Days,Hours,Minutes,Seconds is");
	        System.out.println("Days"+duration1.toDays()+"\tHours"+duration1.toHours()+"\tMinutes"+ duration1.toMinutes()
	        +"\tseconds"+duration1.getSeconds());
	        

	        //count seconds between dates 3.4
	        Duration duration = Duration.between(oldDate, newDate);
	        System.out.println();
	        System.out.println("Difference between "+oldDate+" and "+newDate+" in Days,Hours,Minutes,Seconds is");
	        System.out.println("Days"+duration.toDays()+"\tHours"+duration.toHours()+"\tMinutes"+ duration.toMinutes()
	        +"\tseconds"+duration.getSeconds());
	        
	        //3.5
	        Date date = null;
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        System.out.println("Enter the product purchase date: ");
	        String productPurchaseDate=br.readLine();
	        try {
				date=formatter.parse(productPurchaseDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Enter the waranty period : ");
	        int x= br.read();
	        Period period=Period.ofYears(x);
	        int year=date.getYear()+period.getYears();
	        int month=date.getMonth()+period.getMonths();
	        Date warantyExpiryDate=new Date(year, month, date.getDay());
	        System.out.println("Waranty Expiry date is : "+warantyExpiryDate);
	        
	        
	        
	        //3.6
	        System.out.println("Enter a zone : ");
	        String zon=br.readLine();
	        System.out.println();
	        LocalDateTime zone=LocalDateTime.now(ZoneId.of(zon));
	        System.out.println("Time in "+ZoneId.of("Europe/Paris")+" is "+zone);

	}

}
