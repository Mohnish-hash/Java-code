// final with function 
// error is found 

class A
{
    final void show() // not override
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
    public static void main(Strings[] args)
    {
        B b1 = new D();
        b1.show();
    }
 }