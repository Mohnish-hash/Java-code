//Exception Arrayindexofbound
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            int arr[]=new int[5];
            System.out.println(arr[10]);

        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("you insert array index 5 ");

        }        
        
    }
}
