//finally
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
        }
        finally
        {
            System.out.println("outer Finally");
            try
            {
                int arr[] = new int[5];
                System.out.println(arr[32]);

            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            finally
            {
                System.out.println("inner finally");
            }
        }

       

               
        
    }
}
