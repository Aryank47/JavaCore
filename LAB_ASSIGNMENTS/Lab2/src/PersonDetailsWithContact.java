
public class PersonDetailsWithContact extends PersonDetails {
	
		
		//Parametrised constructor 
			public PersonDetailsWithContact(String firstName,String lastName,Gender var,int age,double weight,String phoneNumber){
				this.firstName=firstName;
				this.lastName=lastName;
				this.Gender=var;
				this.age=age;
				this.weight=weight;
				this.phoneNumber=phoneNumber;
			}
		
		public void showData(){
			
			System.out.println("Person Details:");
			System.out.println("_______________");
			System.out.println();
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
			System.out.println("Gender: "+Gender);
			System.out.println("Age: "+age);
			System.out.println("Weight: "+weight);
			System.out.println("Phone Number: "+phoneNumber);
			System.out.println();
		}
		


}
