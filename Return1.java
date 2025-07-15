public class Return1 {
  public static void main(String[] args) {

  System.out.println(test());

  }
    static int test()
    {
    try {
      System.out.println(10/0);
      return 88;
      
    } catch (ArithmeticException e) {
      return 900;
    }
    finally
    {
      return 10000;  // finally get override every one 
    }

  }
}

