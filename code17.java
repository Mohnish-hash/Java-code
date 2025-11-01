// nesting if else 
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if(a>b && a>c)
        {
            System.out.println("A is max "+a);
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is max"+b);
            }
            else
            {
                System.out.println("c is max"+c);
            }    
        }    


    }
}
