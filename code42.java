// Print The array  with user input the data\
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The num =");
      int i,sum=0,num=sc.nextInt();
      
      int arr[]=new int[num];

      for(i=0; i < arr.length;i++)
      {
        arr[i] = sc.nextInt();
      }  

      // new loop for arr
      // for(datatype variablename:collectionname)

      for(int x:arr)
      {
        sum=sum +x;   
      }
      System.out.println("Sum of all array value="+sum);


    }
}
