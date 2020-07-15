
abstract public class Shape {
	
	int length,breadth,height;
	
    abstract public void calculateArea();
    
    public Shape(int length,int breadth,int height){
    	this.length=length;
    	this.breadth=breadth;
    	this.height=height;
    	
    }
    
    public void displayShapeName(){
    	System.out.println("Shape is not Known");
    }

}
