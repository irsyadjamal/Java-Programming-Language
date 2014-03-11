import java.util.Scanner;

public class Selection01_05{
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		int number1,number2,temp,answer,result;

		number1 = (int) (Math.random() * 10);
		number2 = (int) (Math.random() * 10);

		if (number1 < number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;

			System.out.print("What is " + number1 + " - " + number2 +"?");
			answer = scan.nextInt();

			result = number1 - number2;

			if (result == answer){
				System.out.println("Correct.");
			} else {
				System.out.println("Wrong. The answer should be " + result);
			}
		} else if (number1 == number2) {
			System.out.print("What is " + number1 + " - " + number2 +"?");
			answer = scan.nextInt();

			result = number1 - number2;

			if (result == answer){
				System.out.println("Correct.");
			} else {
				System.out.println("Wrong. The answer should be " + result);
			}
		} else {
			System.out.print("What is " + number1 + " - " + number2 +"?");
			answer = scan.nextInt();

			result = number1 - number2;

			if (result == answer){
				System.out.println("Correct.");
			} else {
				System.out.println("Wrong. The answer should be " + result);
			}
		}

		System.out.println("Thanks for using my games.");
	}
}
