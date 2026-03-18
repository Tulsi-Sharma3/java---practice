import java.util.*;
public class  Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=20;
        int c;
        System.out.println("a is " + a + "and b is " + b);
        c=b;
        b=a;
        a=c;
        System.out.println("After swap a = " + a + "and b = " + b);
    }
}
