import java.util.Scanner;
public class Selection01_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = scan.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + answer + " is "
				+ (number1+number2==answer));
	}
}
