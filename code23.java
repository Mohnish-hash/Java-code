// Print the Fibonacci series 0 1 1 2 3 5 8 13 ....
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       int i,a=0,b=1,c,num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Number");
       num= sc.nextInt();
       System.out.println(a); // a is 0
       System.out.println(b); // b is 1



       for(i=1;i<=num;i++)
       {
         c = a+b;
         System.out.println(c);

         a=b;
         b=c;

       }

    }
}
