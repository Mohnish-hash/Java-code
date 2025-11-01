import java.util.Scanner;
class A
{
    public static void divsion(int a,int b) throws Exception
    {
        int c ;
        if(b==0)
        {
            throw new Exception("Input value greater then zero");

        }
        else
        {
            c = a/b;
            System.out.println("value is = "+c);
        }    
    }
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    int a,b;
    System.out.println("Enter the Numbers");
    a = sc.nextInt();
    b = sc.nextInt();

    try
    {
        divsion(a,b);
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
  } 


}
