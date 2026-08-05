
import java.util.Scanner;

public class DisariumNumber {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   //ystem.out.println("Enter a number");
   //nt num = scanner.nextInt();
    int rim ;
    int count = 0;
    int num = 456456123;

    do{
       rim = num / 10;
       num = rim;
      count++;

    }while(rim!=0);

    System.out.println(num);
    System.out.println(count);


    

  }
  
}
