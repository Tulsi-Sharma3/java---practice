import java.util.*;
public class  Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sales: ");
        double sales = sc.nextDouble();

        double commission = 0;

        if(sales < 500){
            commission = sales * 0.02;
        }

        else if(sales >= 500 && sales < 5000){
            
            commission = sales * 0.05;
        }

        else{
            commission = sales * 0.08;
          

    }
}
}
