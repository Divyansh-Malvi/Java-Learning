import java.util.Scanner;

public class LargestOfTwo {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter integer 1");
    int num1 = scanner.nextInt();
    System.out.println("Enter integer 2");
    int num2 = scanner.nextInt();

    if(num1 > num2){
        System.out.println("Number 1 is largest = " + num1);
      
    } else if (num1 < num2) {
        System.out.println("Number 2 is largest = " + num2);
      
    } else{
      System.out.println("Both number are equal => " + num1 + " == " + num2);
    }
  }
  
}
