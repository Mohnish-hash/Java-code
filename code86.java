// abstract class use

abstract class A
{
    abstract public void show();
    abstract public void display();
}

class B extends A
{
    public void show()
    {
        System.out.println("show called");
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
        //method 1
        /* A a1;
        B b1 = new B();
        a1=b1;
        a1.show();
        */

        A a1 = new B();
        a1.show();
        a1.display();

    }
}
