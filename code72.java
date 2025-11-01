// print this with  constructor 
class A
{
    int id;
    String name;

    A()
    {
        System.out.println("This construtor");
    }

    A(int x)
    {
       this();
       System.out.println("This constructor"+x);
    }

    A(int x , int y)
    {
        this(x);
        System.out.println("This constructor"+(x+y));
    }
    A(int x , int y , int z)
    {
        this(x,y);
        System.out.println("This constructor"+(x+y+z));
    }
}

class demo
{
    public static void main(String[] args)
    {
        A a1 = new A(10,20,30);    
    }
}