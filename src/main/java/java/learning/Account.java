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

	public String getCodeNumber() {
		return codeNumber;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public double getMoney() {
		return money;
	}

	public boolean isStatus() {
		return status;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
