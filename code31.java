// Print if date is 25 then print CHRISTMAS and Print ORDINARY
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int Date;
        System.out.println("Enter your  December Date =");
        Date =sc.nextInt();
        if(Date<=31)
        {
            if(Date==25)
            {
                System.out.println("CHRISTMAS");
            }
            else
            {
                System.out.println("ORDINARY");
            }
        }    
        else
        {
            System.out.println("Your Date is Invalid");
        }
            
    
        

    }
}
