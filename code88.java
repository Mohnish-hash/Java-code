// multi level concept
interface myinter1
{
    public void show();
    public void run();
}

interface myinter2
{
    public void display();
    public void fun();
}

class A implements myinter1,myinter2
{
    public void show()
    {
    System.out.println("show called");
    }
    public void run()
    {
    System.out.println("run called");
    }
    public void display()
    {
    System.out.println("display called");
    }
    public void fun()
    {
    System.out.println("fun called");
    }


}

class demo
{
    public static void main(String[] args)
    {
        myinter1 m1 = new A();
        myinter2 m2 = new A();
        m1.show();
        m1.run();
        m2.display();
        m2.fun();

    }
}