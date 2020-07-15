
abstract public class Animal {
	
	int age;
	String color;
	String name;
	
	public Animal(){
		
	}
	
	public Animal(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
	
	abstract void eat();
	
	void show(){
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("age: "+age);
		
	}

}
