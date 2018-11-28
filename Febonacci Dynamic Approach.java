package fibonacci.dynamic;

import java.util.Scanner;

/**
 *
 * @author Tofayel Ahamed Topu
 */
public class FibonacciDynamic {
        static long[] Fib = new long[100];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter position: ");
        int n = input.nextInt();
         for (int i = 0; i < Fib.length; i++) {
            Fib[i]=-1;
        }
          System.out.println(fibDynamic(n));
    }
    static long fibDynamic(int n){
        if(n==1 || n==0)
            return n;
        else if(Fib[n]!=-1)
             return Fib[n];
        else 
            Fib[n]= fibDynamic(n-1)+fibDynamic(n-2);
            return Fib[n];
    }
}

