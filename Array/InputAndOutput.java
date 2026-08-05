
import java.util.Scanner;

public class InputAndOutput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[5];
    System.out.println("Enter 5 integers");
    for(int i = 0; i < nums.length; i++){

       nums[i] = scanner.nextInt();
    }

    for (int i : nums) {
      System.out.print(i + " ");
    }

  }

}
