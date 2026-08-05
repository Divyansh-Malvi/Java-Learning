import java.util.Scanner;

class Divisible{
  public int divide(int num){
    if(num % 5 == 0 && num % 11 == 0){
      System.out.println("Num id divisible by 5 and 11");
    } else{
      System.out.println("Number is not divisible by 5 and 11");
    }
    return num;
  }
}

public class DivisibleBy5And11 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num = scanner.nextInt();

    Divisible div = new Divisible();
    div.divide(num);

   // System.out.println(result);
    
  }
  
}
