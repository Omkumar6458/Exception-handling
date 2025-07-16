public class Control2 {
  public static void main(String[] args) {
    try{
      System.out.println(10/0);
    }
    catch(ArithmeticException e)
    {
      System.out.println(10/0);  // this error not show when i put error in finallly 
    }
    finally{
      String s = null;
     System.out.println(s.length());

    System.out.println("this is good !");
    }

    System.out.println("oko");
  }
  
}
 // DEFAULT EXCEPTION HANDLER HANDLE ONLY ONE AT A TIME SO WHY IT NOT HANDLE LINE NO . 8 , IT HANDLE LINE 8 WHEN I SOLVE FINALLY STATEMENT