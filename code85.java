// final with class

final class A
{
    void show()
    {
        System.out.println("A is called");
    }

}
class B extends A
{
    void show()
    {
        System.out.println("B show called");
    }
}
 class demo
 {
    public static void main(String[] args)
    {
        B b1 = new B();
        b1.show();
    }
 }