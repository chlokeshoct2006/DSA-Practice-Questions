import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(majority(arr));

    }
    public static int majority(int[] arr) {
        int n = arr.length;
        int count = 0 , candidate = 0;
        for(int i=0; i<n; i++){
            if(count==0){
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }    
}
