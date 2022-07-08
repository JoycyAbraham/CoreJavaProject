import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Enter number1");
			int num1 = sc.nextInt();

			System.out.println("Enter number2");
			int num2 = sc.nextInt();

			System.out.println("Enter required operation: ");
			System.out.println("Enter ur choice \n 1 for Addition \n 2 for Multiplication \n 3 for Subtraction \n 4 for Division \n 5 for Modulus \n 6 for exit");
			int op = sc.next().charAt(0);
			switch (op) {
			case '1':
				int sum = num1 + num2;
				System.out.println("Addition" + sum);
				break;
			case '2':
				int multi = num1 * num2;
				System.out.println("Multiplication" + multi);
				break;

			case '3':
				int sub = num1 - num2;
				System.out.println("Subtraction" + sub);
				break;

			case '4':
				float div = num1 / num2;
				System.out.println("Division" + div);
				break;
			case '5':
				float rem = num1%num2;
				System.out.println("Remainder: "+rem);
				break;
			case '6':
				System.exit(0);
				//break;
			default:
				System.out.println("Invalid input..");
			}
			System.out.println("Enter Yes or No to perform any operations");
			choice = sc.next().charAt(0);
		} while ((choice == 'Y') || (choice == 'y'));
		System.out.println("Session ended...");
		
	}
}
