package mergesortimplementation;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */

public class MergeSortImplementation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arraySize = input.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("After applying Mergesort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int a[], int begin, int mid, int end){
        int left_length = mid-begin+1;
        int right_length = end-mid;
        int left[] = new int[left_length+1];
        int right[] = new int[right_length+1];
        for(int i=0; i<left_length; i++){
            left[i] = a[begin+i];
        }
        left[left.length-1] = Integer.MAX_VALUE;
        for(int i=0; i<right_length; i++){
            right[i] = a[mid+1+i];
        }
        right[right.length-1] = Integer.MAX_VALUE;
        int L=0,R=0;
        for(int i=begin;i<=end;i++){
            if(left[L]<right[R]){
                a[i]=left[L];
                L++;
            }else{
                a[i] = right[R];
                R++;
            }
        }
    }
    public static void mergeSort(int a[], int begin, int end){
        if(begin>=end) return;
        int mid = (begin+end)/2;
        mergeSort(a,begin,mid);
        mergeSort(a,mid+1,end);
        merge(a,begin,mid,end);
    }  
}
