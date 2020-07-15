
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith=new Person("Smith", 40f);
		Person kathy=new Person("Kathy", 40f);
		
		smith.setAccNo();
		smith.setBalance(2000);
		
		kathy.setAccNo();
		kathy.setBalance(3000);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		

	}

}
