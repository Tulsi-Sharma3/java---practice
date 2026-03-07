import java.util.*;
import java.io.*;
public class FileInputStream {
    public static void main(String[] args){
    //Scanner sc = new Scanner(System.in);
    try{
    FileInputStream fis = new FileInputStream("file.txt");
    int i;
    while((i = fis.read()) != -1){
        System.out.print((char)i);
    }
    fis.close();
    }
    catch(Exception e){
        System.out.println("Error reading file");
    }
    }
}
