// code  Super with function [Function overriding = same name same task different class/
\]

class A
{
     void show()
     {
        System.out.println("A is show called");
     }
    
}

class B extends A
{
    
    void show()
    {
        super.show();
        System.out.println("B is show called");
    }

    
}

class C extends B
{
    
    void show()
    {
        super.show();
        System.out.println("C is show called");
    }

    
}

class D
{
    public static void main(String[] args)
    {
        
       C c1 =new C();
       c1.show();
    }
}
