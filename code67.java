// print the constructor (para)
class A
{
    int id;
    String name;

    A(int x,String y)
    {
        id = x;
        name = y;
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
        a1.showdata();
    }
}