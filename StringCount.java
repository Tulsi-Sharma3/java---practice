import java.util.*;
public class StringCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text: ");
        String text = sc.nextLine();
        int count = 0;
        int sent =0;
        int space =0;
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==ch){
                count++;
            }
        }
        for(int i=0; i<text.length(); i++){
                if(text.charAt(i)== '.'){
                   sent++; 
                }
            }
        for(int i=0; i<text.length(); i++){
                if(text.charAt(i)== ' '){
                   space++; 
                }
            }
        
        System.out.println("word: " + count);
        System.out.println("sentence : " + sent);
        System.out.println("words: " + space);
    }      

}
