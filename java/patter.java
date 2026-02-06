import java.util.Scanner;

public class patter {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter tne number of rows:");
      int n = sc.nextInt();

      int i;
      int j;
      for(i = 1; i <= n; i++) {
         for(j = 1; j <=i; j++) {
            System.out.print("*");
         }

         System.out.println();
      }

      for(i = n - 1; i >= 1; i--) {
         for(j = 1; j <= i; j++) {
            System.out.print("*");
         }

         System.out.println();
      }

      sc.close();
   }
}
