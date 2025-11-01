import java.io.*;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr=new FileReader("file4.txt");
            int i;
            while((i=fr.read())!=-1)
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