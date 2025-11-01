import java.io.*;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("file2.txt");
            String str ="Coding Expert";

            byte [] b1=str.getBytes();
            fout.write(b1);
            System.out.println("Data saved");
            


        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}