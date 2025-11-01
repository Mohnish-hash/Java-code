// Print Even odd number
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        num= sc.nextInt();
      

        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        //if(num%2 !=0)
           // System.out.println(" Number is odd");
        else
        {
            System.out.println("Number is odd");
        }    



    }
}
