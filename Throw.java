import java.util.*;
public class Throw {
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter your balance");
    int balance = scn.nextInt();

    System.out.println("withdraw..money");
    int withdraw = scn.nextInt();

    if(withdraw > balance)
    {
      throw new ArithmeticException("Insufficient money ");
    }

    int rem_balance = balance-withdraw;
    System.out.println("remaining balance is "+ rem_balance);


  }
}
