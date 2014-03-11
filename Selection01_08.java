import java.util.*;

public class Selection01_08{
	public static void main(String[]args){
		Calendar now = Calendar.getInstance();
		int hour, minute, month, day, year;
		String greeting;

		hour = now.get(Calendar.HOUR_OF_DAY);
		minute = now.get(Calendar.MINUTE);
		month = now.get(Calendar.MONTH) + 1;
		day = now.get(Calendar.DAY_OF_MONTH);
		year = now.get(Calendar.YEAR);

		if (hour < 12){
			greeting = "Good Morning."
		} else if (hour < 17){
			greeting = "Good Afternoon."
		} else {
			greeting = "Good Evening.";
		}
		System.out.println(greeting);

		System.out.print("It's");
		if (minute != 0){
			System.out.print(" " + minute + " ");
			System.out.print((minute != 1) ? "minutes" : "minute");
			System.out.print(" past.");
		}

		System.out.print(" ");
		System.out.print( (hour > 12) ? (hour . 12) : hour );
		System.out.print(" o'clock on ");

		switch (month){
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("February");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("October");
				break;
			case 11:
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				break;
		}
		System.out.println(" " + day + ", " + year + ".");
	}
}
