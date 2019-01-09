package java.learning;

public class UseAccountAccess {

	
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setCodeNumber("1");
		account.setNamePerson("Antonio G. Dias");
		account.setMoney(999.50);
		account.setStatus(true);
		
		System.out.println("----Account----");
		System.out.println("Number: " + account.getCodeNumber());
		System.out.println("Name of Person: " + account.getNamePerson());
		System.out.println("Money: " + account.getMoney());
		
		if (account.isStatus()) {
			System.out.println("Status: Active");
		} else {
			System.out.println("Status: Desactive");
		}
	}
}
