// return but  No Argument
// print factorial of number 
import java.util.Scanner;
class func
{
    public static int fact()
    {
        int num,f=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        num = sc.nextInt();
        
        for(i=1;i<=num;i++)
        {
            f = f*i;
               
        }

        return f;

    }
    public static void main(String[] args)
    {
        int x=fact(); // Calling 
        System.out.println(x);
    }

}