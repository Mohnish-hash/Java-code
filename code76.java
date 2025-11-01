// code single level inheritance 

class A
{
    int a ;
    void setA()
    {
        a = 100;
    }

    void showA()
    {
        System.out.println("A is ="+a);
    }
}

class B extends A
{
    int b;

    void setB()
    {
        b = 200;
    }
    void showB()
    {
        System.out.println("B is ="+b);
    }
}

class demo
{
    public static void main(String[] args)
    {
        B b1 = new B();
        b1.setA();
        b1.showA();
        b1.setB();
        b1.showB();

    }
}
