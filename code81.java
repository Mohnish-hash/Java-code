// code  Super with Constructor

class A
{
     A()
     {
        System.out.println("A is show called");
     }
    
}

class B extends A
{
    
    B()
    {
        
        System.out.println("B is show called");
    }

    
}

class C extends B
{
    
    C()
    {     
        System.out.println("C is show called");
    }

    
}

class D
{
    public static void main(String[] args)
    {
        
       C c1 =new C();
       
    }
}
