import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" INPUT : ");

        int size,count =0,odd = 0;

        System.out.println("enter the size : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a num : ");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                count++;
                }
            else{
                odd++;
            }
        }
        System.out.println("Even count : " + count);
        System.out.println("odd count : " + odd);
        }
}
        
     


