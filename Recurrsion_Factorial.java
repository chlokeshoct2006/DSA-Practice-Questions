import java.util.*;
public class Recurrsion_Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        return n*print(n-1);
    }
}
