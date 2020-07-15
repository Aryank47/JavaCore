

public class DisplayPersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails divya=new PersonDetails("Divya", "Bharathi",Gender.F,20 , 85.55);
		divya.showData();
		PersonDetailsWithContact ram=new PersonDetailsWithContact("Ram", "Dass",Gender.M,20 , 85.55,"8970600231");
		ram.showData();
		PersonDetails sita=new PersonDetails();
		sita.showData();
	}

}
