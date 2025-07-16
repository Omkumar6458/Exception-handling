
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
public class Throws {
  public static void main(String[] args) {
    
  Read r = new Read();

  //  r.readFile(); // cause error : unreported it said handle this one : hence use try-caught 


  try {
    r.readFile();
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }
System.out.println("All are done here !");



try {
  r.saveFile();

} catch (FileNotFoundException e) {

 e.printStackTrace();
 System.out.println("is this run !");
}


  }
}
class Read{
  //--throws can handle by try-catch::

  void readFile() throws FileNotFoundException
  {
    FileInputStream fil = new FileInputStream("d:/abc.text");
    
  }

 void saveFile() throws FileNotFoundException
 {
  String text ="this is demo";
  FileOutputStream fo = new FileOutputStream("D:/xyx.txt");
 }


}

// use try-catch : onsted of throws , as it can cause abnormal termination of program 