import java.util.*;
public class DigitSeparator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int size = 4;

        int n=1234;
        for(int i=0; i<4; i++){
            System.out.println(n%10);
    
            n=n/10;
            
        }
        //System.out.println( store );
}
}