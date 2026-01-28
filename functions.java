import java.util.*;
public class functions{
    public static void main(String[] args){
        double num;
        System.out.println("Enter the num value : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        System.out.println("Absolute value : " + Math.abs(num));
        System.out.println("Square root value : " + Math.sqrt(num));
        System.out.println("Power value : " + Math.pow(num,2));
        System.out.println("Sin value : " + Math.sin(num));
        System.out.println("Cosine value : " + Math.cos(num));
    }
}
