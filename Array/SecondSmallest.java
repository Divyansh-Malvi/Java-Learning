public class SecondSmallest {
  public static void main(String[] args) {
    int[] nums = {-1000 , 0, -500, -10, -20, -100};
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < smallest) {
        secondSmallest = smallest;
        smallest = nums[i];
      }else if (nums[i] > smallest && nums[i] < secondSmallest) {
        secondSmallest = nums[i];
      }
    }
System.out.println("Smallest = " + smallest);
System.out.println("Second Smallest = " + secondSmallest);

  }
  
}
