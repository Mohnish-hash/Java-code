// print the addition of two number by 3 function with argument

import java.util.Scanner;
class A
{
    int a,b,c;
    void setdata(int x,int y)
    {
        a=x;
        b=y;

    }
    void adddata()
    {
        c = a+b;
    }
    void showdata()
    {
        System.out.println(c);
    }
}
class demo
{
    public static void main(String[] args) 
    {
        A a1 = new A();
        a1.setdata(100,200);
        a1.adddata();
        a1.showdata();
    
    }
    
}
