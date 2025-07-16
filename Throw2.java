import java.util.*;
public class Throw2 extends RuntimeException{
  public static void main(String[] args) {
   
   
   // throw new Throw2();  ->this cause error 
   System.out.println("ok");
    throw new Throw2();
    
  }
}
