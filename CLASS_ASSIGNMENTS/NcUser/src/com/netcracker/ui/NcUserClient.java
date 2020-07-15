package com.netcracker.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dto.NcUser;
import com.netcracker.service.NcUserService;
import com.netcracker.service.NcUserServiceImpl;

public class NcUserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		NcUserService ncuserSer=new NcUserServiceImpl();
		NcUser ncuser=null;
		System.out.print("Enter 1 for Authentication\nEnter 2 for Exit\n");
		
		while(true) {
			System.out.println("Enter your choice(1/2)");
			try {
				int choice=Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:{
					System.out.println("Enter the Username:");
					String username=br.readLine();
					System.out.println("Enter the password:");
					String password=br.readLine();
					ncuser=new NcUser(username, password);
					//System.out.println(ncuser.getPassword()+" "+ncuser.getUserName());
					try {
						String msg=ncuserSer.Authenticate(ncuser);
						System.out.println(msg);
					} catch (DatatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				break;
					
				case 2:{
					System.exit(0);
				}

				default:
					System.out.println("Invalid Choice");
					break;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
