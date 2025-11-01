class A extends Thread
{
    public void show()
    {
         for(int i=0;i<=5;i++)
         {
            try
            {
            Thread.sleep(2000);
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            System.out.println(Thread.currentThread().getName()+" -"+i);
        
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
      
    }
}