// print the addition of two number using class and object

import java.util.Scanner;
class A
{
    int a,b,c;
    void setdata()
    {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;

    }
    void showdata()
    {
        System.out.println(c);
    }
}
class demo
{
    public static void main(String[] args) {
        A a1 = new A();
        a1.setdata();
        a1.showdata();
    
    }
    
}
