
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Triangle(20,30,40);
		shape.calculateArea();
		shape.displayShapeName();
		
		
		shape=new Rectangle(30,40,50);
		shape.calculateArea();
		shape.displayShapeName();

	}

}
