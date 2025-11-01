// print the even andd odd by 3 function with argument

import java.util.Scanner;
class A
{
    int i;
    
    void even(int num)
    {
        for(i=0;i<=num;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }

    void odd(int num)
    {
        for(i=0;i<=num;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
    
}
class demo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        A a1 = new A();
        System.out.println("Enter the Number");

        int num=sc.nextInt();

        if(num%2==0)
            a1.even(num);
        else 
            a1.odd(num);

    }
    
}
