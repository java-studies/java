package java.learning;

public class UseAccount {

	
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		System.out.println("----Before----");
		System.out.println("Number: " + account.codeNumber);
		System.out.println("Name of Person: " + account.namePerson);
		System.out.println("Money: " + account.money);
		
		if (account.status) {
			System.out.println("Status: Active");
		} else {
			System.out.println("Status: Desactive");
		}
		
		account.codeNumber = "1";
		account.namePerson = "Antonio Dias";
		account.money = 10;
		account.status = true;
		
		System.out.println("----After----");
		System.out.println("Number: " + account.codeNumber);
		System.out.println("Name of Person: " + account.namePerson);
		System.out.println("Money: " + account.money);
		
		if (account.status) {
			System.out.println("Status: Active");
		} else {
			System.out.println("Status: Desactive");
		}
		
		Account account2 = new Account("2", "Antonio Gonçalves", 1000.99, true);
		System.out.println("----Account 2----");
		System.out.println("Number: " + account2.codeNumber);
		System.out.println("Name of Person: " + account2.namePerson);
		System.out.println("Money: " + account2.money);
		
		if (account2.status) {
			System.out.println("Status: Active");
		} else {
			System.out.println("Status: Desactive");
		}
		
		Account account3 = new Account("3", "Antonio GD", 500.99, true);
		System.out.println("----Account 3----");
		System.out.println("Number: " + account3.getCodeNumber());
		System.out.println("Name of Person: " + account3.getNamePerson());
		System.out.println("Money: " + account3.getMoney());
		
		if (account3.isStatus()) {
			System.out.println("Status: Active");
		} else {
			System.out.println("Status: Desactive");
		}
	}
}
