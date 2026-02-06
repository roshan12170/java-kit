
import java.util.Scanner;

public class patterns {
    /*public static void hallow_rectangle( int n, int m) {
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++){
                if(i == 1 || i == n || j == 1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }*/
  
    public static void butterfly(int n){
        for (int i = 1; i <=n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } 
        
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }  
        for (int i = n; i >=1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } 
        
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }  
    }    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne number of rows:");
        //System.out.println("Enter tne number of column:");
        int x = sc.nextInt();
        ///int y = sc.nextInt();

       // hallow_rectangle(x,y);
       butterfly(x);
    }
}
    

