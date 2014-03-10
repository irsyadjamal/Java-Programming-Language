import java.util.Scanner;

public class Selection01_03{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int integer = scan.nextInt();
    
    if (integer % 5 == 0) {
      System.out.println("HiFive");
    }
    
    if (integer % 2 == 0) {
      System.out.println("HiEven");
    }
  }
}
