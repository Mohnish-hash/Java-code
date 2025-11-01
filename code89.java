// hirarchi level concept
interface A
{
    public void show();
   
}

interface B extends A
{
    public void display();
   
}
interface C extends B
{

    public void fun();
}


class D implements B,C
{
    public void show()
    {
    System.out.println("show called");
    }
    public void fun()
    {
    System.out.println("fun called");
    }
    public void display()
    {
    System.out.println("display called");
    }


}

class demo
{
    public static void main(String[] args)
    {
        B b1 = new D();
        C c1 = new D();
        b1.show();
       
        b1.display();
        c1.fun();

    }
}