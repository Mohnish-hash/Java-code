// Print the sum of all odd  number 
import java.util.Scanner;
class demo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number =");
    int i,sum=0,num = sc.nextInt();
    int arr[] = new int[num];

    for(i=0;i < arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }

    for(int x:arr)
    {
      if(x%2 !=0)
      {
        sum =sum+x;
        
      }
      
    }
    System.out.println("Sum of all odd number ="+sum);

  }
}