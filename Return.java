public class Return {
  public static void main(String[] args) {
    try{
      System.out.println("ty executed ! ");
      return;
    }
    catch(ArithmeticException e)
    {
      System.out.println("catch blovk executed! ");
    }

    finally{
      System.out.println("finally blovk executes ");
    }
  }
}
