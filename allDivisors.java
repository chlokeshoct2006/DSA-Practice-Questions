import java.util.*;
public class allDivisors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        divisors(n);
    }
    public static void divisors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
