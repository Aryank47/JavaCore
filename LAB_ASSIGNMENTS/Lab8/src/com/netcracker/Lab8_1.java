package com.netcracker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Lab8_1 {
	 private static final String NEW_LINE_SEPARATOR = System.getProperty("line.separator");  
	 
	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
		
		FileReader input=new FileReader("C:\\Users\\Aryan Kumar\\Desktop\\NetCrackerJavaTraning\\qqq.txt");
		FileWriter writer=new FileWriter("C:\\Users\\Aryan Kumar\\Desktop\\NetCrackerJavaTraning\\reverseqqq.txt");
       
        BufferedReader br = new BufferedReader(input);
 
        StringBuffer rev = new StringBuffer();
        String line;   
       
        line = br.readLine();
        
        while (line != null){
           
            StringTokenizer tok = new StringTokenizer(line, ".,- \t\n\"", true);
           
            while (tok.hasMoreElements()) {
               
                String word = (String)tok.nextElement();
                 
               
                for (int i= word.length()-1; i >=0 ; i--) {
                    rev.append(word.charAt(i));
                }
            }
           
            line = br.readLine();
            
            if (line != null){
                rev.append(NEW_LINE_SEPARATOR);
            }
        }
        br.close();
 
        writer.write(rev.toString());
        writer.close();
         
        System.out.println(rev.toString()); 
         
         
        rev.setLength(0);
    }

}
