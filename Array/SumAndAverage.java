import java.util.Scanner;

public class SumAndAverage {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int length = scanner.nextInt();

    System.out.println("Enter an integer for an array");
    int[] nums = new int[length];
    int sum = 0;

    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
      sum += nums[i];
    }

    int average = sum / length;

    System.out.println("Sum of the whole array = " + sum);
    System.out.println("Average of the whole array = " + average);
  }

}
