// Array sum using classs object

import java.util.Scanner;
class A
{
    Scanner sc = new Scanner(System.in);
    int numm , i , sum = 0,arr[];


    void setArray()
    {
        System.out.println("Enter your array size");
        numm = sc.nextInt();
        arr=new int[numm];
    for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    void sumarray()
    {
        for(i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        
    }

    void showsum()
    { 
        System.out.println("Sum of array"+sum);
  
    }
}    

    class Demo
    {
        public static void main(String[] args) 
        {
            A a1=new A();
            a1.setArray();
            a1.sumarray();
            a1.showsum();

        }
    }



