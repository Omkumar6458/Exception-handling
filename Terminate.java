public class Terminate {
  public static void main(String[] args) {
    try {
      System.out.println("this is try block");
      System.exit(0);  // due to this finally block is not get executed ! 

    } catch (Exception e) {
        
      System.out.println("if any occur execute");
    }
    finally{
      System.out.println("as there is system.exit , i will not get printed ! ");
    }
  }
}
