package java.learning;

public class AccountAccess {
	
	private String codeNumber;
	private String namePerson;
	private double money;
	private boolean status;

	public AccountAccess() {}

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
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
