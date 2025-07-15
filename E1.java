import java.util.*;
public class E1 {
  public static void main(String[] args) {
    A a1 = new A();
    a1.school();
  }
}

// --------------------Runtime Stack mechnism--------------------------------------
class A {
  public void school()
  {
     classess();
  }

  public void classess()
  {
    System.out.println("This is section ");
  }
}

/*
 * main() // get call :
 *----------------------
 school()  // get top of it 
 main()
 ----------------------------------
 classess() // get top of it 
 school()
 main()
 -------------------------------
 * NOW EXECUTION IS DONE START FROM classess() section :::
 * 
 * 
 */

