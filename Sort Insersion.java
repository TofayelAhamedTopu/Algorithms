package insersionsort;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */
 class Insersionsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int arrayLength = input.nextInt();
        int arr[] = new int[arrayLength];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        insertionSort(arr);
        System.out.println("After applying insertion sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
     
    }
    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int temp = a[i];
            int j;
            for (j = i-1; j>=0 && temp<a[j]; j--){
                a[j+1]=a[j];
            }
            a[j+1] = temp;
        }
        
    }

}
