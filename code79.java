// code  Super with varible

class A
{
    int x=100 ;
    
}

class B extends A
{
    int x=200;
    void show()
    {
        System.out.println(super.x);
        System.out.println(x);
    }

    
}

class D
{
    public static void main(String[] args)
    {
        
       B b1 =new B();
       b1.show();
    }
}
