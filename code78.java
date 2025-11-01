// code hierarchi level inheritance 

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

class C extends A
{
    int c;

    void setC()
    {
        c = 300;
    }
    void showC()
    {
        System.out.println("C is ="+c);
    }
}

class demo
{
    public static void main(String[] args)
    {
        B b1 = new B();
        C c1 = new C();
        c1.setA();
        c1.showA();
        c1.setC();
        c1.showC();
        b1.setA();
        b1.showA();
        b1.setB();
        b1.showB();

    }
}
