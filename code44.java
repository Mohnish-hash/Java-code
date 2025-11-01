-// Search the data from array
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The num =");
      int i,value,count=0,num=sc.nextInt();
      int arr[] = new int[num];

      for(i=0; i < arr.length;i++)
      {
        arr[i] = sc.nextInt();
      }  
      System.out.println("Enter the value=");
      value= sc.nextInt();

      for(int x:arr)
      {
        if(x==value)
          count++;
      }
      if(count ==0)
        System.out.println("Not Found");
      else
        System.out.println("Found");



    }
}
