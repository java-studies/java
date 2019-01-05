package java.learning;

public class CondicionalLoop {

	public static void main(String[] args) {

		// Loop if
		if (true) {
			System.out.println("True");
		}
		
		// Loop if/else
		if (false) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		int numIf = 10;
		if (numIf <= 10) {
			System.out.println("Number is 10 or less");
		}
		
		// Loop if multiple validation
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
		
		// Loop while
		int num = 0;
		while (num < 10) {
			System.out.println("Number: " + num);
			num++;
		}
		
		// Loop do...while
		do {
			System.out.println("Number: " + num);
			num++;
		} while(num < 10);
	}
}
