//Class exception 
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
            String str ="amit";
            int x = Integer.parseInt(str);
            }
            catch(Exception ex)
            {
              System.out.println(ex.getMessage());  
            }

            int arr[]=new int[5];
            System.out.println(arr[20]);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());

        }        
        
    }
}
