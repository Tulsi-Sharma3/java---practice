import java.util.Scanner;

public class SquareQube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the no. : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            int square = arr[i] * arr[i];
            int cube = arr[i] * arr[i] * arr[i];
            System.out.println("square : " + square + " " + "cube : " + cube);
            }
        
        }
}

