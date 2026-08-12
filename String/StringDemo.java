
public class StringDemo {
  public static void main(String[] args) {
    
    //declaration and initialisation
    // String is actually a class

    String name = "InsiDarr";

System.out.println("Hello " + name);
System.out.println(name.charAt(3));
// new object will be created for name , value of name is not changed or replaced with Divy.InsiDarr , new object has been created and old name object
// will be eligible for garbage collection to free the memory
name = "Divy." + name;
// only 1 object will be created for S1 and S2
String S1 = "divy";
String S2 = "divy";

System.out.println(name);
System.out.println(S1.hashCode() + " | " + S2.hashCode());
System.out.println(S1 == S2);

  }
  
}
