import java.util.*;


public class que1{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {47,26,33,93,78};
        int size = 5;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]<smallest){
                smallest = arr[i];

            }

        }
        System.out.println(smallest);
    }
}