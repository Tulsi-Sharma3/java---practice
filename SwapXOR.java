import java.util.Scanner;

public class SwapXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=20;
        int c;
        System.out.println("a is " + a + " and b is " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a = " + a + " and b = " + b);
    }
}
