class A implements Runnable
{
    public void run()
    {
         System.out.println("Thread Start..");
    }
}
class demo
{
    public static void main(String[] main)
    {
        A a1=new A();
        Thread t1=new Thread(a1);
        t1.start();
    }
}