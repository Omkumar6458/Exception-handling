
import java.util.*;
public class Custom2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    try{
    System.out.println("enter ");
    int number = scn.nextInt();

    if(number == 10)
    {
      throw new Tennot("Not Allow ");
    }

    else {
     System.out.println("you can proceed next-->");
    }
  }
  catch( Tennot t)
  {
    System.out.println("Handle::"+ t.getMessage());
  }


  }
}




class Tennot extends RuntimeException
{
  Tennot(String s)
  {
    super(s);
  }
}