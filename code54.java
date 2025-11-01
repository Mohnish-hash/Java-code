// Print the 2d array sortring for user value


import java.util.Scanner;
class demo
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    int i,j,num1,temp;
    System.out.println("Enter your Array size =");
    num1 = sc.nextInt();
    int arr[]=new int[num1];

    System.out.println("Enter your array data");
    

    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }

    System.out.println("Your Input array");

    for(i=0;i<arr.length;i++)  
      {
        System.out.println(arr[i]+" ");
      }  
    
    System.out.println("Your Display array for pattern ");

    for(i=0;i<arr.length;i++)
    {
      for(j=0;j<arr.length-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]= temp;
        }


      }
      System.out.println(arr[i]+"");
    }     
  }
}