
public class WhileLoopDemo {
  public static void main(String[] args) {
    
    int i = 1;

    while (i <= 5){
      System.out.println("YOO " + i);
      int j = 0;
            while (j <= 2) {
              System.out.println("Hell Yeah.. " + j);
              j++;
            }
      i++;
    }
  }
}
