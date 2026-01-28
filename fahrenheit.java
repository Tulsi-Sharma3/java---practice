import java.util.*;
public class fahrenheit {
    public static void main(String[] args){

        int size;

        System.out.println("Enter the size : ");

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double fahrenheit[] = new double[size];
        double celcius[] = new double[size];
        System.out.println(" fahrenheit : ");
        for(int i=0; i<size; i++){
            fahrenheit[i] = sc.nextDouble();
            celcius[i] = (fahrenheit[i] - 32) / 1.8;
        } 
        for(int i=0; i<size; i++){
            System.out.println((i+1) + " " + fahrenheit[i] + " " + celcius[i]);
        }
    }
}
