import java.io.*;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fin=new FileInputStream("file1.txt");
            int x=fin.read();
            System.out.println((char)x);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}