package coinchagnedynamic;

import java.util.Scanner;
/**
 *
 * @author Tofayel Ahamed Topu
 */
public class CoinChagneDynamic {
public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
         System.out.println("Enter the Amount: ");
          int amout =input.nextInt();
         System.out.println("Enter the total coin: ");
         int n=input.nextInt();
          int coin[] = new int[n];
          System.out.println( "Enter all currency values: ");
          for(int i = 0;i< n; i++)
          coin[i] = input.nextInt();
        coinChangeDynamic(coin,amout);
    }
    public static void coinChangeDynamic(int coin[],int amount){
        int row = coin.length;
        int col = amount+1;
        int table[][] = new int[row][col];
        for (int i = 0; i < coin.length; i++) {
            table[i][0]=0;
        }
        for (int j = 0; j < col; j++) {
            table[0][j]=j/coin[0];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(j<coin[i]){
                    table[i][j] = table[i-1][j];
                }else{
                    table[i][j] = Math.min(table[i-1][j],table[i][j-coin[i]]+1);
                }
            }
        }
        System.out.println("Min coin needed :"+table[row-1][col-1]);
        System.out.println("Printing Table: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j]+"     ");
            }
            System.out.println("");
        }
    }   
    
}
