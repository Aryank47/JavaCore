package com.netcracker.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import com.netcracker.customexception.CustomException;
import com.netcracker.dto.Customer;
import com.netcracker.dto.Mobile;
import com.netcracker.service.MobileService;
import com.netcracker.service.MobileServiceImpl;

public class MobileBillingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileService mobser=new MobileServiceImpl();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter 1 To Insert Purchase Details\nEnter 2 To Search In Price Range\nEnter 3 To Veiw All Entries\nEnter 4 for EXIT\n");
		while(true) {

				System.out.println();
				System.out.println("Enter your choice(1/2/3/4)");
				int choice;
				try {
					choice = Integer.parseInt(br.readLine());
				
				switch (choice) {
					case 1:{
						
						System.out.println("Enter Customer Name:");
						String name = br.readLine();
						System.out.println("Enter Email ID:");
						String email=br.readLine();
						System.out.println("Enter the Contact number:");
						String number=br.readLine();
						System.out.println("Enter Mobile id:");
						int mid=Integer.parseInt(br.readLine());
						Customer cus=new Customer(name, email, number, mid);
						boolean flag=mobser.verifyCustomer(cus);
						
						System.out.println("Enter Quantity:");
						int quantity=Integer.parseInt(br.readLine());
						
						if(flag==true) {
							int count=mobser.insertPurchaseDetails(cus);
							int count1=mobser.updateMobileQuantity(quantity, cus);
							System.out.println(count+" Record Entered in Customer database.");
							System.out.println(count1+" Record updated in Mobile Database");
						}
						
				
					}
					break;
					case 2:{
						
						List<Mobile> mobileList=new LinkedList<Mobile>();
						System.out.println("Enter Lower Price Range:");
						double lpr=Double.parseDouble(br.readLine());
						System.out.println("Enter Upper Price Range:");
						double upr=Double.parseDouble(br.readLine());
						mobileList=mobser.searchOnPriceRange(lpr, upr);
						System.out.println("The available mobiles in the specified price range is: ");
						for(Mobile e:mobileList) {
							System.out.println(e.toString());
						}
					}
					break;
					
					case 3:{
						List<Mobile> mobileList=new LinkedList<Mobile>();
						mobileList=mobser.viewAll();
						System.out.println("The available mobiles in the inventory are:");
						for(Mobile e:mobileList) {
							System.out.println(e.toString());
						}
						
					}
					break;
					case 4:{
						System.exit(0);
					}
				} 
				
				}catch (NumberFormatException | IOException | CustomException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
