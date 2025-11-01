class A extends Thread
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
        a1.start();
    }
}