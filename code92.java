// String buffer use in code
class demo
{
    public static void main(String[] args)
    {
        StringBuffer b1 = new StringBuffer("coding");
        b1.append("Expert");
        b1.insert(2,"Expert");
        b1.replace(0,2,"jain");
        b1.delete(0,2);
        System.out.println(b1);


        // same as StringBuilder 
        // they are fast as compare to buffer

    }
}