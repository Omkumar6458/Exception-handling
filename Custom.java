
import java.util.*;
public class Custom {
  public static void main(String[] args) {
  
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter Age");
    int age = scn.nextInt();

    if(age >60)
    {
      throw new TooOld("you are too old..... wait !");  // this will terminated anormally so, used try -catch 
    }
    else if(age < 18)
    {
      throw new Tooyoung("your age is under 18 ......wait !");   
    }

    System.out.println(" cong ! your matched according to given norms....");



  }
}

//
class Tooyoung extends RuntimeException  // this is unchecked exception 
{
  Tooyoung(String s)
  {
   super(s);
  }
}

//
class TooOld extends RuntimeException  // here TooOld is subclass of RuntimeException  --> so it is unchecked exception
// here no need to handle with try catch:;
{
  TooOld(String s)  // act like constructor 
  {
    super(s);  //  super(s) calls the constructor of the parent class (RuntimeException) and passes the message to it.
              //   Without super(s), your exception won't carry any message.
  }
}















