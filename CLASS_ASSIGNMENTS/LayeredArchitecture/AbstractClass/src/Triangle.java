
public class Triangle extends Shape {
	
	 public Triangle(int length,int breadth,int height){
		 
	    	super(length,breadth,height);
	}

	@Override
	public void calculateArea() {
		
		
		// TODO Auto-generated method stub
		height=20;
		breadth=200;
		
		float area=0.5f*height*breadth;
		
		System.out.println("Area of triangle is "+area);
		
		
	}
	
	public void displayShapeName(){
		System.out.println("Shape is Triangle.");
	}
	
	void show(){
		System.out.println("I am part of triangle.");
	}
	
	

}
