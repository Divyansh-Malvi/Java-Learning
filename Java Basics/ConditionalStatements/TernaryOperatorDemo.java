import java.util.Scanner;

public class TernaryOperatorDemo {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int num = 7;
    int result = 0;

    //Ternary Operator
    result = num % 2 == 0 ? 10 : num % 3 == 0 ? 30 : 0;

    System.out.println(result);

  }
  
}
