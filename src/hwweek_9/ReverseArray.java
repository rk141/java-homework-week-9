package hwweek_9;

import java.util.Scanner;

public class ReverseArray {

    public void reverse() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int[] ary = new int[n];
        for (int i=0; i < n; i++){
            System.out.println(" Enter integer element" +(i+1));
            ary[i] = sc.nextInt();

        }
        System.out.print("Original array is : ");
        for (int i = 0; i < n; i++){
            System.out.print(ary[i]+" ");
        }
        System.out.print("\nReversed array is : ");
        for (int i = n-1; i >=0; i--) {
            System.out.print(ary[i] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.reverse();
    }
}
