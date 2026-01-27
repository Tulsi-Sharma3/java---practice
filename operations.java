import java.util.Scanner;
public class operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" INPUT : ");

        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println("Sum : ");
		System.out.println(num1 + num2);

		System.out.println("Difference : ");
		System.out.println(num1 - num2);
			
		System.out.println("Product : ");
		System.out.println(num1 * num2);

		System.out.println("Quotient : ");
        if(num2 == 0){
				System.out.println("Not valid");
				     }
		else{
			        System.out.println(num1 / num2);
			     }

		System.out.println("Maximum : ");
		if(num1 > num2){
            System.out.println(num1);
				     }
		else{
			System.out.println(num2);
			    }

		System.out.println("Minimum : ");
        if(num1 < num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
