import java.util.*;
public class Invalid {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("enter valid input");

  

    try{

      int n = scn.nextInt();
      
      System.out.println(n);

    } catch(Exception e)
    {
      System.out.println("Enter valid number !");
    }
      
  }
}


