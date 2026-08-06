import java.util.Scanner;

public class SmallestElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size an array");
    int length = scanner.nextInt();
    System.out.println("Enter elements for an array");
    int[] nums = new int[length];
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }

    System.out.println("Smallest element = " + min);
  }
  
}
