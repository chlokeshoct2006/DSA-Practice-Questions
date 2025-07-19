import java.util.Scanner;

public class validPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt();
        System.out.println("number is Palindrome: "+intPalindrome(number));
    }
    public static boolean intPalindrome(int nums){
        int original = nums;
        int rev = 0;
        while (nums>0) {
            int digit = nums%10;
            nums = nums/10;
            rev = rev *10+digit;
        }
        if(rev==original){
            return true;
        }
        return false;
    }
}