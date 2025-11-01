class A extends Thread
{
    public void run()
    {
         for(int i=0;i<=10;i++)
         {
            try
            {
            Thread.sleep(2000);
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
        a1.start();
    }
}