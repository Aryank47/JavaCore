public class PersonDetails {
	protected String firstName;
	protected String lastName;
	
	protected int age;
	protected double weight;
	protected String phoneNumber;
	Gender Gender;
	
	//Default constructor
	public PersonDetails(){
		
	}
	
	//Parametrized constructor
	public PersonDetails(String firstName,String lastName, Gender var,int age,double weight){
		this.firstName=firstName;
		this.lastName=lastName;
		Gender=var;
		this.age=age;
		this.weight=weight;
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
		System.out.println();
	}
	

}

