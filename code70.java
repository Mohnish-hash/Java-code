// this with varible  = current class varible 
class A
{
    void show()
    {
        System.out.println("Show called");
    }
    void show(int x)
    {
        this.show();
        System.out.println("Show called"+x);
    }
    void show(int x, int y)
    {
        this.show(x);
        System.out.println("Show called"+(x+y));
    }
    
    void show(int x , int y,int z)
    {
        this.show(x,y);
        System.out.println("Show called"+(x+y+z));
    }
}
class demo
{
    public static void main(String[] args)
    {
        A a1 = new A();
      
        a1.show(10,20,30);

    }
}

    