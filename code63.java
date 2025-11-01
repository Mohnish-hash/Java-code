// Array find max value using classs object

import java.util.Scanner;
class A
{
    Scanner sc = new Scanner(System.in);
    int numm , i , max= 0,arr[];


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

    void maxarray()
    {
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        
    }

    void showmax()
    { 
        System.out.println("max value of array = "+max);
  
    }
}    

    class Demo
    {
        public static void main(String[] args) 
        {
            A a1=new A();
            a1.setArray();
            a1.maxarray();
            a1.showmax();

        }
    }



