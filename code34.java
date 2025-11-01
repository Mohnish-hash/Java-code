//  return but No Argument
import java.util.Scanner;
class func
{
    public static int add()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        return c;
        

    }
    public static void main(String[] args)
    {
        int x=add(); // Calling 
        System.out.println(x);
    }

}