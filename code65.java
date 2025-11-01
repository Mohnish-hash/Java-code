// print one object to data copy to another object as a argument
class A
{
    int id;
    String name;

    void setdata()
    {
        id = 101;
        name = "coding";
    }
    void copydata(A x1)
    {
        id = x1.id;
        name =x1.name;
    }

    void showdata()
    {
        System.out.println(id+" "+name);
    }
}

class demo
{
    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();
        a1.setdata();
        a2.copydata(a1);
        a2.showdata();
    }
}