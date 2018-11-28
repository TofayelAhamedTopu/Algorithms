package linear.search;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */

public class LinearSearch {
 public static void main(String[] args) {
        int i,n,key;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        n= input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (i = 0; i <a.length;i++){ 
        a[i] = input.nextInt();}
        System.out.println("Enter value to find");
        key = input.nextInt();
        for (i = 0; i <a.length;i++)
       if(a[i]==key)
          break;
        if(i<n){
           System.out.println("Element found at index: "+i);
       }
        else System.out.println("Element Not found");
       
    }
}
        

    

