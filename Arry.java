import java.util.*;
public class Arry {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter N");
     int n = scn.nextInt();
       
     int[] arry = new int[n];

    try {

      for(int i=0;i<n;i++)
      {
        arry[i] = scn.nextInt();
      }

      for(int i=0;i<n;i++)
      {
        System.out.println(arry[i]);
      }
      
    } catch (Exception e) {
     System.out.println("enter valid ");
    }

  }
}
