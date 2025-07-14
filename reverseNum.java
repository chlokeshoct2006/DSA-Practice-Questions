import java.util.*;
public class reverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
         
        int reversed = reverseNumber(number); 
        System.out.println("Reversed number: " + reversed);
    }
    public static int reverseNumber(int n){
        int num = 0;
        while (n>0) {
            int digit = n % 10;
            n=n / 10;
            num = num * 10 + digit;
        }
        return num;
    }
}