package coinchange;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */
public class CoinChange {
 public static void main(String args[]) 
      {
      int i,n,amount,cost,paid;
      System.out.println( "Enter amount to be paid: ");
      Scanner sc = new Scanner(System.in); 
      paid = sc.nextInt();
      System.out.println( "Enter amount to be cost: ");
      cost = sc.nextInt();
      amount =paid-cost;
      System.out.println( "Enter total currency: ");
      n = sc.nextInt();
      Integer[] coin_value= new Integer[n];
      System.out.println( "Enter all currency values: ");
      for(i = 0;i< n; i++)
      coin_value[i] = sc.nextInt();
      Arrays.sort(coin_value, Collections.reverseOrder());
      System.out.println( "The selected currecy values are: ");
      min_coins(coin_value,n,amount);
      }
     public static void min_coins(Integer coin_value[],int n,int amount)
      {
        for( int i=0; i< n; i++ ) 
          while(amount >= coin_value[i])
          {
            amount= amount - coin_value[i];
            System.out.println(coin_value[i]+"is Used="+(amount/coin_value[i])+"times  ");
          }
        System.out.print("\n");
      }
}
