class A extends Thread
{
    public void show()
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
        
         }
    }
}
class demo
{
    public static void main(String[] main)
    {
        A a1=new A();
        
        a1.start();
        a1.setName("Thread");
        System.out.println(a1.getName());
    }
}