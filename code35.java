// return with  Argument
import java.util.Scanner;
class func
{
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;

    }
    public static void main(String[] args)
    {
        int a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        a = sc.nextInt();
        b = sc.nextInt();
        
        x =add(a,b); // Calling 
        System.out.println(x);
    }

}