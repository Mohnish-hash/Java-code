// If satatment
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b)
            System.out.println("This a is maximum");
        if(a<b)
            System.out.println("This b is maximum");

    }
}
