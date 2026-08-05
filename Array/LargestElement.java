import java.util.Scanner;

public class LargestElement {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of an array");
    int length = scanner.nextInt();
    int[] nums = new int[length];
    
    System.out.println("Enter an integer");

    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
    }

    int temp = nums[0];


    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > temp) {
        temp = nums[i];
      }
    }

    for (int i : nums) {
      System.out.print(i + " ");
    }

    System.out.println();

    System.out.println("The largest array element = " + temp);

  }

}
