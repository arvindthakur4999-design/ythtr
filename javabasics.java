import java.util.Scanner;

public class javabasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int [] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("print the array elements: ");
        for (int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
