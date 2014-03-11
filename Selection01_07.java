import java.util.Scanner;

public class Selection01_07{
	public static void main (String[]args){
		Scanner scan = new Scanner (System.in);
		String command;

		int balance = 750;
		int quantity = 50;

		System.out.print("Enter a command (BUY/SELL)");
		command = scan.next();
		scan.nextLine();
		switch (command) {
			case "BUY" :
				quantity += 10;
				balance -= 30;
				break;
			case "SELL" :
				quantity -= 10;
				balance += 30;
				break;
		}

		System.out.println("Balance: " + balance + "\n" + 
			"Quantity: " + quantity);
	}
}
