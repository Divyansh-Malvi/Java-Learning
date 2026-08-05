import java.util.Scanner;

class LeapYear{
  public void yearCheck(int year){
    if ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){
      System.out.println("Yes, it is leap year = " + year);
      
    } else{
      System.out.println("It is not the leap year");
    }
  }
}
public class LeapYearChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter year");
    int y = scanner.nextInt();
    LeapYear lp = new LeapYear();
    lp.yearCheck(y);
  }
  
}
