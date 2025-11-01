import java.io.*;
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream f1=new FileInputStream("File1.txt");
            FileInputStream f2=new FileInputStream("File2.txt");
            
            SequenceInputStream s1 =new SequenceInputStream(f1,f2);
            int i;
            while((i=s1.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}