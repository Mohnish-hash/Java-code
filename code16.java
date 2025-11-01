// salary bouns print question
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int salary,bonus,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        salary = sc.nextInt();
      

        if(salary>5000)
        {
            bonus =salary*20/100;
            total = salary+bonus;
            System.out.println("Totals"+total);
        }
        //if(salary<5000)
           // bonus =salary*20/100;
            //total = salary+bonus;
            //System.out.println("Totals"+total);
        else
        {
            bonus =salary*10/100;
            total = salary + bonus;
            System.out.println("Totals"+total);
            
        }    



    }
}
