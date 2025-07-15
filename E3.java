import java .util.*;

public class E3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter Numenator ");
    int a = scn.nextInt();

    System.out.println("Enter denumenator");
    int b = scn.nextInt();


    try {
       int result = a/b; // risky 
       System.out.println("result"+ result);
      
    } catch (Exception e) { // ArithmeticException e
      
      System.out.println("enter another value of b");

    }
  }
}
