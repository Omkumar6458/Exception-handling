public class Control {
  public static void main(String[] args) {
    try{
      System.out.println("statement1");
      System.out.println("statements2");
      System.out.println("statement 3");
    }

    catch(Exception e)
    {
      System.out.println("statement 4");
    }
    finally{
      System.out.println("statemet 5");
    }
    System.out.println("statement 6");
  }
}
// ------------ALL CONDITION--------------------
/*
    1. NO EXCEPTION OCCUR :::::

    PRINT --> 1,2,3,5,6  --> AS ERROR STATEMENT NOT EXECUTED
-----------------------------------------------------
    2. EXCEPTION OCCUR AT STATEMENT-2:

    MODIFY :
    TRY {
    SOUT("STATEMENT 1");
    SOUT(10/0);
    SOUT("STATEMENT 3");
}
    PRINT ---> 1,4,5,6  
    
    --------------------------------------------------
 *  3. IF EXCEPTION OCCUR AT STATEMENTS 1 :
 * 
 *  PRINT--> 4,5,6
 * --------------------------------------------------
 * 
 * 
 * 4. EXCEPTION OCCUR BUT NOT CAUGHT :
 * 
 * PRINT---> ONLY FINILLY STATEMT . ANY OF TRY BLOCK STATEMENT GET PRINT , AFTER THAT IT FINALLY JUMP TO FINALLY , AS IT NOT GO TO STAT: 6 AS IT GET CRASH
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