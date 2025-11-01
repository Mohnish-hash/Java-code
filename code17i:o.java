import java.io.*;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("file1.txt");
            fout.write(65);
            fout.close();
            System.out.println("Data saved");

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}