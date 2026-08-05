
import java.util.Scanner;

public class PositiveNegativeOrZero {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = scanner.nextInt();
    if (num == 0) {
      System.out.println("Number is zero" + num);
    } else if (num > 0) {
      System.out.println("Number is positive" + num);
    } else {
      System.out.println("Number is negative" + num);
    }
  }
}
