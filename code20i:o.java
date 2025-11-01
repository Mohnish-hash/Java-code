import java.io.*;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fin=new FileInputStream("file3.txt");
            int i;
            while((i=fin.read())!=-1)
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