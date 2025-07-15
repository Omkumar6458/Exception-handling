public class Final2 {
  public static void main(String[] args) {
    try{
      System.out.println("try block executed !");
      System.out.println(10/0);

    }

    ///---here there  is no nullpointer exception : so default arthimetic is done :
    catch(NullPointerException e)
    {
      System.out.println("is here null pointer !");
    }


    /*catch(Exception e)  // this is universal superset , if this execute , no such default occur 
    {
      System.out.println("eoor hai ");
    }*/


    // always executed ------------------
    finally
    {
      System.out.println("finally block is executed ");
    }


  }
}
