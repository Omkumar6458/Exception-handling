import java.util.*;


public class Throw_Throws {
  public static void main(String[] args) {
    
    //Test t = new Test();
   // t.method();
    

  //******ONLY THROW --WITH UNCHECKED ********************************** */
   int number = 10;

        if (number == 10) {
            throw new ArithmeticException("10 is not allowed");  // unchecked
        }

        System.out.println("Continue...");
    }

//*************CHECKED WITH ONLY THROW  (UNVALID)*********************************** */



/*******************THROWS WITH CHECKED  */

/*
 * 
 * import java.io.IOException;

public class ThrowsOnlyChecked {
    public static void readFile() throws IOException {
        // Nothing thrown here yet
        System.out.println("Reading file...");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}

 * 
 * 
 * 
 * 
 * 
**************THROWS ONLY WITH UNCHECKED (IGNORE BY COMPILER ********************************************** * 
 * 
 * public class ThrowsOnlyUnchecked {
    public static void divide() throws ArithmeticException {
        int a = 10 / 0;  // unchecked
    }

    public static void main(String[] args) {
        divide();  // No need for try-catch
    }
}

 * 
 * 
 * ***THROW + THROWS --WITH CHECKED 
 * 
 * 
 * class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class ThrowAndThrowsChecked {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Underage!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}

 * 
 * 
 * 
 * 
 * 
 * *********THROW + THROW -WITH UNCHECKED (THROWS IS OPTIONAL)
 * 
 * 
 * 
 * class TenNotAllowed extends RuntimeException {
    TenNotAllowed(String msg) {
        super(msg);
    }
}

public class ThrowAndThrowsUnchecked {
    static void checkNumber(int num) throws TenNotAllowed {
        if (num == 10) {
            throw new TenNotAllowed("10 is not allowed");
        }
    }

    public static void main(String[] args) {
        checkNumber(10);
    }
}

 * 
 * 
 * 
 * 
































 * 




 */






    
  }
}

// Using  throw without throws::
/* 


 class Test {
  public void method(){
        int a = 10;
        if (a == 10) {
            throw new ArithmeticException("10 is not allowed");
        }
    }
  }


*/

/*
 *  
 * THIS IS LEAGAL BUT NOT ACTUALLY THROWN ANY 
 * 
 * void readFile() throws IOException {
    // no actual throw here
    System.out.println("Reading file...");
}

 * **********************************************
 * 
 * WITHOUT USING THROWS CHECKED EXCEPTION IS NOT ALLOWED 
 * 
 * EX:
 * VOID TEST()
 * {
 * THROW NEW IOEXCEPTION("EILE ERROR"); // COMPLILE ERROR
 * }
 * 
 * 
 * TO FIX IT :
 * VOID TEST() THROWS IOEXCEPTION {
 * 
 * THROW NEW IOEXCEPTION("FILE ERROR");
 * }
 * ***************************************************
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 





 * 
 */



