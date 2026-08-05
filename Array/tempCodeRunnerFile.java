

import java.util.Scanner;

public class SecondLargestElement {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array length");
    int length = scanner.nextInt();
    int[] nums = new int[length];
    System.out.println("Enter the fucking integers");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    int largest = nums[0];
    int secondLargest = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] >= largest) {
        secondLargest = largest;
        largest = nums[i];
        
      } else if(nums[i] < largest && nums[i] > secondLargest){
        secondLargest = nums[i];
      }
    }

    System.out.println("Largets element = " + largest);
    System.out.println("Second Largest element = " + secondLargest);
  }
  
}
