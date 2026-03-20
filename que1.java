import java.util.*;

public static int fun(int arr[],size){
    int smallest = Integer.MAX_VALUE;
    for(int i=0; i<=size; i++){
    if(arr[i]<smallest){
        smallest = arr[i];
        }
    return smallest;
}
public class que1{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int arr[] = {47,26,33,93,78};
        // int size = 5;
        // int smallest = Integer.MAX_VALUE;
        // for(int i=0; i<size; i++){
        //     if(arr[i]<smallest){
        //         smallest = arr[i];

        //     }

        // }
        // System.out.println(smallest);
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        
        System.out.println(fun(arr[],10));
    }
}