import java.util.*;
public class Recurrsion_print1ToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}