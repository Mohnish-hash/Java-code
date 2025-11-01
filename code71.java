// this with varible  = current class varible 
class A
{
    int id;
    String name;
    void show(int id,String name)
    {
        this.id = id;
        this.name = name;
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
        a1.show(10,"mohnish");
        a1.showdata();
      

    }
}
