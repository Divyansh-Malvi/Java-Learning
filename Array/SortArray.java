public class SortArray {
  public static void main(String[] args) {

    int[] nums = {4, 2, 0, 5, 6, 9, 1};

    //outer loop for no. of passes 
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }

      }

    }

    for (int i : nums) {
      System.out.print(i + " ");
    }

  }  
}
