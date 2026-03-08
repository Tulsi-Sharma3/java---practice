import java.util.*;
public class TryCatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int  a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Division by 0 error");
        }
        
    }
}
