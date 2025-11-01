class A extends Thread
{
    public void run()
    {
         for(int i=0;i<=5;i++)
         {
            try
            {
            Thread.sleep(1000);
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            System.out.println("Thread - "+i);
         }
    }
}
class demo
{
    public static void main(String[] main)
    {
        A a1=new A();
        A a2=new A();
        A a3=new A();
        a1.start();
        a2.start();
        a3.start();
    }
}