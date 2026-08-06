import java.util.Scanner;

public class SearchElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int length = scanner.nextInt();
    int[] nums = new int[length];
    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
    }
    System.out.println("Enter the element to search");
    int element = scanner.nextInt();
    boolean flag = false;
    int index = 0;

    for (int i = 0; i < length; i++) {
      if (nums[i] == element) {
        flag = true;
        
        System.out.println("Element found at index = " + i);
        break;
       // index = i;
    
      }
    }

     if (!flag) {
    System.out.println("Element not found");
     }
    //   System.out.println("Element about at index = " + index);
    // } else{
    //   System.out.println("Element not found");
    // }
  }
  
}
