// Print The array 2d 
class demo
{
    public static void main(String[] args)
    {
      // datatype arrayname[][]={{},{},{}}
      // datatype arrayname[][]=new datatype[size][size]
      // datatype []arrayname[]=new datatype[size][size]

      int arr[][]={{1,2,3},{4,5,6,},{7,8,9,}};
      
      // Method 1
      /*for(i=0; i < arr.length;i++)
      {
        for (j=0;j<arr.length ;j++ ) 
        {
          System.out.print(arr[i][j]+" ");
          
        }
        System.out.println("");
      }  
      */

      // Method 2

      for (int  i[]:arr) 
      {
        for(int j:i)
        {
          System.out.print(+j" ");
        }
        System.out.println("");
      }

    }
}
