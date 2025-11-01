// Function overloading
class A
{
    void show()
    {
        System.out.println("Show called");
    }
    void show(int x)
    {
        System.out.println("Show called"+x);
    }
    void show(int x, int y)
    {
        System.out.println("Show called"+(x+y));
    }
    void show(int x,String name)
    {
        System.out.println("Show called"+x +name);
    }
    void show(int x , int y,int z)
    {
        System.out.println("Show called"+(x+y+z));
    }
}
class demo
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.show();
        a1.show(10);
        a1.show(10,20);
        a1.show(10,"Md");
        a1.show(10,20,30);

    }
}
