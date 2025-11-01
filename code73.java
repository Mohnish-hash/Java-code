class A
{ 
    int x1;
    static int a2;
}
class demo{
    public static void main(String[] args)
    {
        A a1 = new A();

         //System.out.println(a1.x1+ "  " +a1.x2)  //print 0 0 beacuse static varible call by class

        System.out.println(a1.x1+ "  " +A.a2);

    }
}