import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        System.out.println("Number is Armstrong: "+validArmstrong(n));
    }
    public static boolean validArmstrong(int n){
        int digits = String.valueOf(n).length();
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum+=Math.pow(digit,digits);
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
