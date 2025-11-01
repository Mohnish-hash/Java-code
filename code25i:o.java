import java.io.*;
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream f1=new FileOutputStream("FIle5.txt");
            DataOutputStream d1=new DataOutputStream(f1);

            d1.writeByte(65);
            d1.writeInt(100);
            d1.writeDouble(12.453);
            d1.writeBoolean(true);

            d1.close();
            f1.close();

            FileInputStream fin=new FileInputStream("File5.txt");
            DataInputStream d2=new DataInputStream(fin);
            System.out.println(d2.readByte());
            System.out.println(d2.readInt());
            System.out.println(d2.readDouble());
            System.out.println(d2.readBoolean());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}