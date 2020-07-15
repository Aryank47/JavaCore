
public class Rectangle extends Shape {
	
	 public Rectangle(int length,int breadth,int height){
		 
		 super(length,breadth,height);
	    	
	}
	
	public void calculateArea(){
		length=100;
		breadth=200;
		
		int area=length*breadth;
		System.out.println("Area of the rectangle is "+area);
	}
	
	public void displayShapeName(){
		System.out.println("Shape is Rectangle.");
	}
	

}
