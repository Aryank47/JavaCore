import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.netcracker.PersonDetails;
import com.netcracker.person_details_exception.AgeException;
import com.netcracker.person_details_exception.NameException;
@SuppressWarnings(value = { "resource" })
public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String firstName=null;
		String lastName=null;
		int age=0;
		PersonDetails p1=null;
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the first name.");
			firstName=br.readLine();
			
			if(firstName=="\n") {
				throw new NameException("Enter a valid first name.");
			}
			
			try {
				System.out.println("Enter the last name.");
				lastName=br.readLine();
				if(lastName==null) {
					throw new NameException("Enter a valid last name.");
				}
				try {
					System.out.println("Enter the age.");
					age=br.read();
					if(age<=15) {
						throw new AgeException("Not Eligible,as age is less than 15.");
					}
					else {
						System.out.println("Enter the weight.");
						double weight=sc.nextDouble();
						System.out.println("Enter the gender.");
						String gender=sc.next();
						
						
						p1=new PersonDetails(firstName, lastName, gender, age, weight);
						p1.showData();
						
						ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aryan Kumar\\Desktop\\NetcrackerJavaTraning\\employee.txt"));
						oos.writeObject(p1);
						oos.close();
						
						ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Aryan Kumar\\Desktop\\NetcrackerJavaTraning\\employee.txt"));
						p1=(PersonDetails)ois.readObject();
						ois.close();
						
						System.out.println("Person Details from file: "+p1);
						
					
						
					}
				}catch(AgeException e) {
					e.showError();
				
				}
			}
			catch(NameException e) {
				e.showError();
			
			}
		}catch(NameException e) {
			e.showError();
			
		}
		finally {
			
			
		}
		
		
		
		
		
		
	
	}
		
		
		
		

}


