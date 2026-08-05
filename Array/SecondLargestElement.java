

import java.util.Scanner;

public class SecondLargestElement {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array length");
    int length = scanner.nextInt();

    if (length < 2) {
      System.out.println("Array size is less than 2 , second largest can not be found");
    }
    int[] nums = new int[length];
    System.out.println("Enter the fucking integers");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
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
