class Calculator{

  // int num1 = 6;
  // int num2 = 9;

  int num1;
  int num2;

  public int add(int num1, int num2){
    int result = num1 + num2;
    return result;
  }

}

public class ClassAndObject {
  public static void main(String[] args) {

    int n1 = 45;
    int n2 = 86;

    Calculator calc = new Calculator();

    int r = calc.add(n1, n2);

    System.out.println(r);
    
  }
}
