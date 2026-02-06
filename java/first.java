import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        /*int a =10 , b=20;
        int sum ,sub, mul, div;
        sum=a+b;
        sub=b-a;
        mul=a*b;
        div=b/a;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);*/
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        /*if (num%2==0){
            System.out.println("even number");
            
        }
        else{
            System.out.println("odd number");
        }
        sc.close();
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);*/
        int table=1;
        for (int i = 1; i <=10; i++) {
            table=i*num;
        System.out.println(table);
        }
    }
}
