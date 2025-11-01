// user value as string
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter the Name");

        // name = sc.nextLine();  // This syntax help to full line print & space are not include.
        name = sc.next(); // This syntax  space are include.

        System.out.println("MY Name is ="+name);
        
    }
}
