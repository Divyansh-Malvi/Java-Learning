import java.util.Scanner;

class Voting{
    public int eligibility(int age){

       if (age <= 0) {
      System.out.println("Enter valid age");
    } else if (age > 18) {
      System.out.println("Valid age , you are eligible to vote " + age);
    } else{
      System.out.println("You are not eligible");
    }

      return age;
    }
}

public class VotingEligible {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your age");
    int age = scanner.nextInt();

    Voting vote = new Voting();
    vote.eligibility(age);

   

  }
  
}
