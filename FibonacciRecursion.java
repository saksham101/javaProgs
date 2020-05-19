import java.util.Scanner;
class FibonacciRecursion
{
  int n ;
  static int Fibonacci(int n)
  {
    if(n == 0)
      return 0 ;
    else if(n == 1)
      return 1 ;
    else
      return(Fibonacci(n-1) + Fibonacci(n-2)) ;
  }
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = s.nextInt();
    for(int i=0;i<num;i++)
    {
      System.out.print(Fibonacci(i));
    }

  }
}
