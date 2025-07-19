import java.util.*;
public class Recurrsion_sumOfNnaturalNo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = scanner.nextInt(); 
        int sum = 0;
        print(n,sum);
    }
    public static void print(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        print(n-1,sum+n);
    }
}
