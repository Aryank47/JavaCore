public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger=new Tiger("Tiger","Stripes",10);
		Animal elephant=new Elephant("Elephant","Grey",20);
		Animal ani= null;
		Animal animal[]={ani,tiger,elephant,tiger,tiger,elephant,tiger,elephant,elephant};
		
		
		for(Animal i:animal){
			System.out.println();
			if(i instanceof Tiger){
				i.show();
				((Tiger)i).showTiger();
				((Tiger)i).tigerSound();
			}
			
			
			if(i instanceof Elephant){
				i.show();
				((Elephant)i).showElephant();
				((Elephant)i).elephantSound();
			}
			
			if(i instanceof Tiger==false & i instanceof Elephant==false){
				System.out.println("False");
			}
			
		}
		

	}

}