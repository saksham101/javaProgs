class a3DArray
{
  public static void main(String[] args)
  {
    int arr[][][] = new int [3][3][3] ;
    int i , j , k ;
    for(i = 0 ; i < 3 ; i++ )
        for(j = 0 ; j < 3 ; j++ )
            for(k = 0 ; k < 3 ; k++ )
                arr[i][j][k] = i*j*k ;

    for(i = 0 ; i < 3 ; i++ )
    {
      for(j = 0 ; j < 3 ; j++ )
      {
        for(k = 0 ; k < 3 ; k++ )
        {
          System.out.println(arr[i][j][k] + " ") ;
        }
        System.out.println();
      }
      System.out.println();
    }

  }
}
