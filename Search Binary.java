package search.binary;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */
public class SearchBinary {

    public static void main(String[] args) {
        int begin = 0,flag=0,mid=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int n= input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <a.length;++i){ 
        a[i] = input.nextInt();}
        System.out.println("Enter value to find");
        int key = input.nextInt();
        int end=a.length-1;
        while (begin<=end){
            mid=(begin+end)/2;
            if(a[mid]==key){
               flag=1;
                break;
            }
            else if(a[mid]<key){
                begin=mid+1;
            }
            else end=mid-1;
        }
        if(flag==1)
        {
            System.out.println("Element found at position: "+(mid+1));
        }
        else
                System.out.println("Element not found");
       
    
    }
}
