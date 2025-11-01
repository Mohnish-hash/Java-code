//try catch number check postive negative zero
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num =sc.nextInt();

        try
        {
            if(num>0)
                System.out.println("postive");
            else if(num<0)
                throw new Exception("Negative value");
            else
                System.out.println("zero");
        }  
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
