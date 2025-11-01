// Print the table of any number
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       int i=1,a;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Number");
       a = sc.nextInt();

       while(i<=10)
       {
         System.out.println(""+(a*i));
         i++;
       }

    }
}
