// return with Argument
// print factorial of number 
import java.util.Scanner;
class func
{
    public static int fact(int num)
    {
        
        int f=1,i;
        for(i=1;i<=num;i++)
        {
            f = f*i;
            
        }
        return f;

        

    }
    public static void main(String[] args)
    {
        int num,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        num = sc.nextInt();

        y =fact(num); // Calling 
        System.out.println(y);

    }

}