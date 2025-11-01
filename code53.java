// Print the 2d array for user value
// pattern 
// 0 2 0
// 4 0 6
// 0 8 0

import java.util.Scanner;
class demo
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    int i,j,num1,num2;
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

    System.out.println("Your Input array");

    for(i=0;i<arr.length;i++)
    {
      for(j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+" ");
      } 
      System.out.println("");
    } 
    
    System.out.println("Your Display array for pattern ");

    for(i=0;i<arr.length;i++)
    {
      for(j=0;j<arr.length;j++)
      {
        if(i==j || i+j==2)     
           System.out.print(arr[i][j]+" ");   
        else
        System.out.print("0 "); 
      } 
      System.out.println(""); 
    }     
  }
}