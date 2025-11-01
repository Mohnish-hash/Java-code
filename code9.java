//Exception Null pointer
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            String str ="amit";
            int x = Integer.parseInt(str);

        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("your cannot strint to interger ");

        }        
        
    }
}
