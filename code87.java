interface myinter
{
    public void show();
}

class A implements myinter
{
    public void show()
    {
    System.out.println("show called");
    }
}

class demo
{
    public static void main(String[] args)
    {
        myinter m1 = new A();
        m1.show();
    }
}