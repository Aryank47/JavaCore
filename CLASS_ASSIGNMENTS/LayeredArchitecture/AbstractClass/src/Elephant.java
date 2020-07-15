
public class Elephant extends Animal {
	
	public Elephant(String name,String color,int age){
		super(name,color,age);
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Elephant eats grass.");
		
	}
	
	void showElephant(){
		System.out.println("This is elephant");
	}
	
	void elephantSound(){
		System.out.println("Elephant trumpets");
	}


}
