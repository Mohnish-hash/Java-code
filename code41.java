// sum of all the element in the array
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The num =");
      int i,num=sc.nextInt(),sum=0;
      int arr[] = new int[num];

      for(i=0; i < arr.length;i++)
      {
        arr[i] = sc.nextInt();
        sum = sum+arr[i];
      }  
      System.out.println("Display your array");

      for(int x:arr)
      {
        System.out.println(x);
      }
      System.out.println("sum = "+sum);



    }
}
