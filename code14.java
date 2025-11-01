// If else statement
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        age = sc.nextInt();
      

        if(age>18)
        {
            System.out.println("You can vote");
        }
        //if(age<18)
           // System.out.println("you can not vote");
        else
        {
            System.out.println("You can not vote");
        }    



    }
}
