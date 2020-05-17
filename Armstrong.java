import java.util.Scanner;
class Armstrong
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int result = 0 ;
    int temp ;
    for(int i = num ; i > 0 ; i = i/10)
    {
      temp = i%10 ;
      result += (temp*temp*temp) ;
    }
    if(result == num)
    {
      System.out.print(num + " is Armstrong Number") ;
    }
    else
    {
      System.out.print(num + " is not Armstrong Number") ;
    }
  }

}
