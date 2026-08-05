import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
          System.out.println("Num1 is largest = " + num1);
        } else if (num2 > num3) {
          System.out.println("Num2 is largest = " + num2);
        } else {
          System.out.println("Num3 is largest = " + num3);
        }



  }
  
}
