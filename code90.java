// String use in code 

class demo
{
    public static void main(String[] args)
    {
        String str ="  Welcome the Coding WORLD OPERATOR BY MOHNISH dhurve  ";
        int x = str.length();
        System.out.println("lenght ="+x);
        System.out.println("Len = "+str.length());


        String s1= str.toUpperCase();
        System.out.println("Upper ="+s1);
        System.out.println("Upper = "+str.toUpperCase());

        String s2= str.toLowerCase();
        System.out.println("Lower ="+s2);
        System.out.println("Lower = "+str.toLowerCase());

        char s3 =str.charAt(3);
        System.out.println(s3);
        System.out.println("char =" +str.charAt(5));

        int y=str.indexOf('A');
        System.out.println(y);
        System.out.println("char ="+str.indexOf('o'));

        int z=str.lastIndexOf('R');
        System.out.println(z);
        System.out.println("char ="+str.lastIndexOf('A'));


        String e=str.substring(9);
        System.out.println(e);
        System.out.println("char = "+str.substring(8));

        String f=str.substring(5,20);
        System.out.println(e);
        System.out.println("char = "+str.substring(8,25));

        boolean h =str.contains("coding");
        System.out.println(h);
        System.out.println("contain =" +str.contains("WORLD"));


        String strr ="";
        boolean i=strr.isEmpty();
        System.out.println(i);


        String s4 = str.trim();
        x =s4.length();
        System.out.println("Lenght = "+x);

        byte[] b1=str.getBytes();
        for(byte l:b1)
            System.out.println(l);

        System.out.println(String.join("-","Mohnish"," Is","Boy"));

        System.out.println(str.replace("WORLD", "MOHNISH"));


        String  str2 ="coding";
        str2 = str2.concat("Expert");
        System.out.println(str2);

        
    }
}