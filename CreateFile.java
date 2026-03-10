import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File Obj = new File("meFile.txt");
            if(Obj.createNewFile()) {
                System.out.println("File create: " + Obj.getName());
            }
            else{
                System.out.println("File alredy exist.");
            }
        }

        catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
