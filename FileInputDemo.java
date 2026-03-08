import java.util.*;
import java.io.*;
public class FileInputDemo {
    public static void main(String[] args){
 
    try{
      FileInputStream fis = new FileInputStream("file.txt");
      int i;
      while((i = fis.read()) != -1){
        System.out.print((char)i);
    }

    fis.close();

    }catch(Exception e){
        System.out.println("Error reading file");
    }

    }
}
