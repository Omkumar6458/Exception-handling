public class Final1 {
  public static void main(String[] args) {
    
    try{
      System.out.println("this is working !");
      System.out.println(10/0);
    }
    catch(ArithmeticException e)
    {
      System.out.println("catch block execution !");
    }
    finally
    {
       System.out.println("finally block executed ");
    }
  }
}
