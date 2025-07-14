import java.util.*;
class countDigit {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
     
        int count = countDigits(number); 
        System.out.println("Number of digits: " + count); 
    }
    public static int countDigits(int n) {
        int c=0;
        n=Math.abs(n);
        while (n>0){
            c++;
            n=n/10;
        }
        return c;    
    }
}