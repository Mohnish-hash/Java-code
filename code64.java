// print id and name using class = 2 object

import java.util.Scanner;
class A
{
    
    int id;
    String name;


    void setdata()
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your data");
        id = 101;
        name = "coding";
    }

    void showdata()
    { 
        System.out.println(id+ " "+name);
        

  
    }
}    

    class Demo
    {
        public static void main(String[] args) 
        {
            A a1=new A();
            A a2=new A();

            a1.setdata();
            a2=a1;
            
            a2.showdata();

        }
    }



