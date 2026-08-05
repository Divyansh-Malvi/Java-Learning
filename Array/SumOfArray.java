import java.util.Scanner;


public class SumOfArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[5];
    int sum = 0;
    System.out.println("Enter 5 interegs for addition");

    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    for (int i = 0; i < nums.length; i++) {
    //  sum = sum + nums[i];
    sum += nums[i];
    }
    // for (int i : nums) {
    //   System.out.print(i + " ");
    // }

    System.out.println("Sum of array = " + sum);
  }
}
