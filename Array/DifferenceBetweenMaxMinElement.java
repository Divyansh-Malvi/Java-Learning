import java.util.Scanner;

public class DifferenceBetweenMaxMinElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an array size");
    int length = scanner.nextInt();

    System.out.println("Enter an integer");
    int[] nums = new int[length];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
      
      if (nums[i] > max) {
        max = nums[i];
      } else if (nums[i] < min) {
        min = nums[i];
      }
    }

    int diffrence = max - min;

    System.out.println("Diffrence between max and min element = " + diffrence);
  }
  
}
