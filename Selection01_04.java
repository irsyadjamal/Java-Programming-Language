import java.util.Scanner;

public class Selection01_04{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		char index;

		System.out.print("What is your index? ");
		index = scan.nextChar();

		if (index == 'A' || index == 'a'){
			System.out.println("Great job!");
		} else if (index == 'B' || index == 'b'){
			System.out.println("Good work!");
		} else if (index == 'C' || index == 'c') {
			System.out.println("What went wrong?");
		}
	}
}
