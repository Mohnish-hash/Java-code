// Print factoial of any number
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       int i,f=1,num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Number");
       num = sc.nextInt();

       for(i=1;i<=num;i++)
       {
         f = f*i;
         
       }
       System.out.println("Factorial of number is ="+f);

    }
}
