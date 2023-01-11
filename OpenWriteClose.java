import java.io.*;  
import java.util.*;  
public class OpenWriteClose  
{     
  public static void main(String args[])  
  {  
    try  
    {  
      File new_file=new File("text_file.txt");  
      System.out.println("File opened");
      FileWriter txtfile=new FileWriter(new_file);
      txtfile.write("Hi!I am Chandana Penumuchu");
      System.out.println("Data entered into file");
      txtfile.close();
      System.out.println("File closed");
    }
    catch(Exception e)  
    {  
      System.out.println("Error : "+e); 
    }  
  }  
}  
