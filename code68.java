// print the constructor (copy)
class A
{
    int id;
    String name;

    A(int x,String y)
    {
        id = x;
        name = y;
    }

    A(A x1)
    {
        id = x1.id;
        name = x1.name;

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
        A a1 = new A(100,"Monu");    
        A a2 = new A(a1);

        a1.showdata();
        a2.showdata();
    }
}