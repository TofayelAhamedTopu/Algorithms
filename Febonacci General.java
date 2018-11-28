package fibonacci.general;

import java.util.Scanner;

/**
 *
 * @author Tofayel Ahamed Topu
 */
public class FibonacciGeneral {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Enter position: ");
        int n = input.nextInt();
        System.out.println(fib(n));
    }
    static long fib(int n){
        if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
