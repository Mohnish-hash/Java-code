// Print the 2d array for user value

import java.util.Scanner;
class demo
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    int i,j,sum=0,num1,num2;
    System.out.println("Enter your Array size =");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    int arr[][]=new int[num1][num2];

    System.out.println("Enter your array data");
    

    for(i=0;i<arr.length;i++)
    {
      for(j=0;j<arr.length;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }


    for(i=0;i<arr.length;i++)
    {
      for(j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+" ");
        sum = sum+arr[i][j]; 
      }
      System.out.println("");
      }
      System.out.println("Sum="+sum);
    
    

  }
}