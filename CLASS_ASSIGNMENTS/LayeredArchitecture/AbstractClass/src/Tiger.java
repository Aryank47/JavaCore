
public class Tiger extends Animal {
	
	public Tiger(String name,String color,int age){
		super(name,color,age);
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger eats meat.");
		
	}
	
	void showTiger(){
		System.out.println("This is Tiger.");
	}
	
	void tigerSound(){
		System.out.println("Tiger Roars");
	}

}
