
import java.util.Scanner;

public class pallindrone {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        int r;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev){
        
            System.out.println("number is  pallindrone");
        }
        else{
            System.out.println("number is not pallindrone");
        }
        sc.close();
        }
    
}
