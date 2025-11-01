class A
{ 
    int x1;
    static int x2;

    A()
    {
        x1 =0;
        x2 =0;
    }
    void show()
    {
        x1++;
        x2++;
        System.out.println(x1+" "+x2);
    }
    static void display()
    {
        System.out.println("Display Called");
    }
}



class demo{
    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        a1.show();
        a2.show();
        a3.show();

        a1.display();
        A.display();


      
    }
}