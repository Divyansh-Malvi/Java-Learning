import java.util.Scanner;

public class CountEvenOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an array size");
    int length = scanner.nextInt();
    int[] nums = new int[length];
    int evenCount = 0;
    int oddCount = 0;
    System.out.println("Enter elements for an array");
    // for (int i = 0; i < length; i++) {
    //   nums[i] = scanner.nextInt();
    // }
    // for (int i = 0; i < length; i++) {
    //   if (nums[i] % 2 == 0) {
    //     evenCount++;
    //   }else{
    //     oddCount++;
    //   }
    // }
// instead of storing array then performing operation we can directly count odd and even elements.

    for (int i = 0; i < length; i++) {
      int num = scanner.nextInt();
      if (num % 2 == 0) {
        evenCount++;
      }else{
        oddCount++;
      }
    }

    System.out.println("Number of even element = " + evenCount);
    System.out.println("Number of odd element = " + oddCount);
  }
  
}
