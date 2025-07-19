import java.util.*;
public class Recurrsion_printNTo1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
