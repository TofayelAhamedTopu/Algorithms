package quicksort2;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */
public class QuickSort {

   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter array length:");
        int arraySize=input.nextInt();
        int []arr=new int[arraySize];
        System.out.println("enter arrray element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        System.out.println("after sorting: ");
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }        

    }
    public static int partition(int a[],int begin,int end)
    {
        int last=a[end];
        int i=begin;
        int j=i-1;
        for(; i<end;i++)
        {
            if(last>a[i])
            {
                j++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
                j++;
                int temp2=a[i];
                a[i]=a[j];
                a[j]=temp2;
                
                return j;
    }
    public static void quicksort(int a[],int begin,int end)
    {
        if(begin>=end)
            return;
        int pivot=partition(a,begin,end);
        quicksort(a,begin,pivot-1);
        quicksort(a,pivot+1,end);
    }
    
}
