package java.learning;

public class Account {
	
	String codeNumber;
	String namePerson;
	double money;
	boolean status;

	public Account() {
		this.codeNumber = "1";
		this.namePerson = "Antonio G Dias";
		this.money = 100.50;
		this.status = false;
		
	}
	
	public Account(String codeNumber, String namePerson, double money, boolean status) {
		this.codeNumber = codeNumber;
		this.namePerson = namePerson;
		this.money = money;
		this.status = status;
	}
}
