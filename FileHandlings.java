import java.util.*;
import java.io.IDExeception;
public class FileHandlings {
    public static void main(String[] args){
        File myFile = new file("FirstFile.txt");
        try{
            myFile.createNewFile();
        }catch (IDException e) {
            System.out.println("unable to access");
            e.printStackTrace();

        }

    }
}
