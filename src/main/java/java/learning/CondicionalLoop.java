package java.learning;

public class CondicionalLoop {

	public static void main(String[] args) {

		if (true) {
			System.out.println("True");
		}
		
		if (false) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		int numIf = 10;
		if (numIf <= 10) {
			System.out.println("Number is 10 or less");
		}
		
		int num1 = 5;
		int num2 = 15;
		if (num1 < 6 && num2 >= 15) {
			System.out.println("All conditions are true");
		}
		
		if (num1 < 5 || num2 == 15) {
			System.out.println("One or more conditions are true");
		}
		
		if (num1 % 2 == 1) {
			System.out.println("Condition are true");
		}
		
		int num = 0;
		while (num < 10) {
			System.out.println("Number: " + num);
			num++;
		}
		
		do {
			System.out.println("Number: " + num);
			num++;
		} while(num < 10);
	}
}
