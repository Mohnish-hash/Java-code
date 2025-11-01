// Nesting the class

class outer
{
    int x=100;
    class inner
    {
        void show()
        {
            System.out.println("Show called = "+x);
        }
    }
}

class demo
{
    public static void main(String[] args)
    {
        outer out = new outer();
        outer.inner in = out.new inner();
        in.show();
    }
}