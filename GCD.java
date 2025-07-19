import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a first number: "); 
        int n1 = scanner.nextInt(); 
        System.out.print("Enter a second number: "); 
        int n2 = scanner.nextInt(); 
        
        System.out.println("GCD of n1 & n2 is "+gcd(n1, n2));
    }
    public static int gcd(int n1, int n2){
        int g = 1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                g=i;
            }  
        }
        return g;
    }
}
