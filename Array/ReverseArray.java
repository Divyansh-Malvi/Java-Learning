import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the size of an array");
    int length = scanner.nextInt();

    int[] nums = new int[length];
    
    System.out.println("Enter an integers for an array");

    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    System.out.print("Original Array = ");

    for (int i : nums) {
      System.out.print(i + " ");
    }

    int left = 0;
    int right = length - 1;
   // int temp = 0;

    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;

      left++;
      right--;
    }

    System.out.println();
    System.out.print("Reverse Array = ");
    for (int i : nums) {
      System.out.print(i + " ");
    }

    
      
    }


  }

