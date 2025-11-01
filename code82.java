// code  Super with Constructor (Para)

class A
{
     A(int x)
     {
        System.out.println("A is show called"+x);
     }
    
}

class B extends A
{
    
    B(int x,int y)
    {
        super(x);
        System.out.println("B is show called"+(x+y));
    }

    
}

class C extends B
{
    
    C(int x,int y,int z)
    {     
        super(x,y);
        System.out.println("C is show called"+(x+y+z));
    }

    
}

class D
{
    public static void main(String[] args)
    {
        
       A c1 =new C(100,299,30001);
       
    }
}
