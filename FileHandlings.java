import java.util.*;
import java.io.File;
public class FileHandlings {
    public static void main(String[] args){
        File myFile = new File("FirstFile.txt");
        try{
            myFile.createNewFile();
        }catch (IDException e) {
            System.out.println("unable to access");
            e.printStackTrace();

        }

    }

    FileWriter fileWriter = new FileWriter("Filename");
    fileWriter 

}
