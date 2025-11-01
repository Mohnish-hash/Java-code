// print the constructor (default)
class A
{
    int id;
    String name;

    A() // default
    {
        id = 101;
        name = "coding";
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
        A a1 = new A();// by default calling   
        a1.showdata();   
    }
}