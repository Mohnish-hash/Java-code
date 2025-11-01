// No return with No Argument
import java.util.Scanner;
class func
{
    public static void add()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("Sum"+c);

    }
    public static void main(String[] args)
    {
        add(); // Calling 
    }

}