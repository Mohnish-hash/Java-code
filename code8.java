//Exception Null pointer
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            String str =null;
            System.out.println(str.length());

        }
        catch(NullPointerException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Your value is null ");

        }        
        
    }
}
