import java.util.*;
public class Custom3 {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);

   System.out.println("Enter money !");
   int money = scn.nextInt();

   try{
     if(money<0)
     {
      throw new NegativeWithdraw("unvalid input");
     } else if( money == 0)
     {
      throw new ZeroWithdraw("zero is  unvalid");
     }else if(money >0)
     {
       System.out.println("proceed forward !");
     }
    
   }
   catch(Exception e)  // this will handle for both of them :: negative and zero both.
   {
      System.out.println("handle "+ e.getMessage());
   }



  }
}


class NegativeWithdraw extends RuntimeException{
 
  NegativeWithdraw(String s)
  {
    super(s);
  }
}

class ZeroWithdraw extends RuntimeException{
 
  ZeroWithdraw(String s)
  {
    super(s);
  }

}

