import java.io.*;
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("file3.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Sentence");
            String str =sc.nextLine();

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