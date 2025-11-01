// tostring use in string function

class K
{
        int id;
        String name;
        int age;

        K(int x,String nm,int y)
        {
            id =x;
            name=nm;
            age=y;

        }
        public String toString()
        {
            return id+" "+name+" "+age;
        }
}        

    class Demo
    {
        public static void main(String[] args)
        {
            K obj = new K(10,"monu",18);
            System.out.println(obj);
        }
    }
