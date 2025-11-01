class demo
{
    public static void main(String[] args)
    {
        String s1 = "mohnish";
        String s2 = "mohnish";
        String s3 = "manish";
        String s4 = "karan";
        String s5 = "MOHNISH";
        String s6 = new String("mohnish");


        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));

        System.out.println(s1 == s2);
        System.out.println(s1 ==(s3));
        System.out.println(s1 ==(s4));
        System.out.println(s1==(s5));
        System.out.println(s1 ==(s6));



        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(s1.equalsIgnoreCase(s6));


        






    }
}