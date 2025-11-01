//finally
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();

        try
        {
            if(age>=18)
                System.out.println("You can vote");
            else
                throw new Exception("you cant vote");
        }  
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
