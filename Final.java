
public class Final {
    public static void main(String[] args) {
   
        FinallyExample3 e1 = new FinallyExample3();
        e1.method();

       
        try {
            System.out.println("Try block: No error");
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block: Always run22s");
        }
    }
}



class FinallyExample3 {
    
       public void  method(){
        
        try {
            String s = null;
            System.out.println(s.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block still runs");
        }
    }
    }


