import java.util.*;
public class target {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = 2;
        int size;
        System.out.println("enter the size : ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]==target){
                System.out.println("index : " + i);
            }
        }
        
    }
}
