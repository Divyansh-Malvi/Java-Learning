public class SortArray {
  public static void main(String[] args) {
    int[] nums = {2, 4, 6, 1, 0, 2, 3};
    int right = 0;
    int left = 1;
    while (left < nums.length) {
      if (nums[right] < nums[left]) {
        nums[right] = nums[left];
        right++;
        left++;
      }
    }
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }
  
}
