import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any integer");
    int num = scanner.nextInt();
    if (num % 2 == 0){
      System.out.println("Integer is Even = " + num );
    } else{
      System.out.println("Integer is odd = " + num);
    }
  }
  
}
