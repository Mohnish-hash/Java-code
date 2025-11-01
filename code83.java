// final with variable cannot be change with vaiable it is constant

class A
{
    final int x1 = 1000;
    void show()
    {
        // x1 = 2000; // not change
        System.out.println(x1);
    }

}
class demo
{
    public static void main(String[] args)
    {
        A a1 = new  A();
        a1.show();
    }
}