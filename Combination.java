import java.util.*;
public class Combination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=1,n2=2,n3=3;
        int arr[] = {n1,n2,n3};
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                if(i != j && j != k && i != k){
                System.out.println(
                    arr[i] + " " + arr[j] + " "+ arr[k] + " "
                );
            }
            }
           } 
        }
    }
}
