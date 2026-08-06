public class ReversePrint {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50};
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }
  
}
