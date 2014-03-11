import java.util.Scanner;

public class Selection01_06{
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		String result;
		double weight, height,bmi;

		System.out.print("Enter weight: ");
		weight = scan.nextDouble();
		System.out.print("Enter height: ");
		height = scan.nextDouble();

		bmi = weight / (height*height);

		System.out.println("Yur BMI is " + bmi);
		if (bmi<16) {
			result = "You are seriously underweight";
		} else if(bmi<18){
			result = "You are underweight";
		} else if (bmi<24){
			result = "You are normal weight";
		} else if (bmi < 29){
			result = "You are overweight";
		} else if (bmi<35){
			result = "You are seriously overweight";
		} else {
			result = "You are gravely overweight";
		}

		System.out.println(result);
	}
}
