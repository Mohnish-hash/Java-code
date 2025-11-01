import java.io.*;
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw=new FileWriter("File4.txt");
            fw.write("Hello world");
            fw.close();
            System.out.println("Data Saved");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}