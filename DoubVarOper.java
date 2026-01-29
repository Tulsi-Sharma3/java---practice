import java.util.*;
public class DoubVarOper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT : ");
        System.out.println("Enter the num : ");
        double num = sc.nextDouble();
        int numInteger = (int) num;
        System.out.println("numRound : " + Math.round(num));
        System.out.println("numCeil : " + Math.ceil(num));
        System.out.println("numFloor: " + Math.floor(num));
        System.out.println("numInteger : " + numInteger);
    }
}

