// No return with  Argument
// print factorial of number 
import java.util.Scanner;
class func
{
    public static void fact(int num)
    {
        int i,f=1;
        for(i=1;i<=num;i++)
        {
            f = f*i;
            System.out.println(f);
        }

        

    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        num = sc.nextInt();

        fact(num); // Calling 
    }

}