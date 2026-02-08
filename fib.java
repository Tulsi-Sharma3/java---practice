import java.util.*;
public class fib {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n=5;
         int a=0,b=1,c;
         System.out.println("fib: ");
//         for(int i=0; i<n; i++){
//             System.out.print(a+" ");
//             c=a+b;
//             a=b;
//             b=c;
//         }
        
        int i=0;
        do{
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }while(i<n);
 }
 }