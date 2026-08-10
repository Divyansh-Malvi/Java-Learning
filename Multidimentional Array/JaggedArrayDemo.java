
public class JaggedArrayDemo {
  public static void main(String[] args) {
      
    int[][] nums = new int[3][];
    
    //array and its size [5, 3, 4]
    nums[0] = new int[5];
    nums[1] = new int[3];
    nums[2] = new int[4];

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        nums[i][j] = (int)(Math.random() * 10);
      }
    }

    for (int[] is : nums) {
      for (int is2 : is) {
        System.out.print(is2 + " ");
      }
      System.out.println();
    }

  }
}
