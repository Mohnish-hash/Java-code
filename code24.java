// Print the user number is reversed
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       int rev=0,x,num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Number");
       num= sc.nextInt();

       for(;num>0;) 
       {
        x = num%10; // 123 %10 = 3
        rev = rev*10+x; 0*10+3 = 3
        num =num/10;  =
       }
       System.out.println(rev);
      

    }
}
