import java.util.Scanner;
class FibonacciIteration
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = s.nextInt();
    int fibo1 = 0 , fibo2 = 1 , fibo ;
    System.out.print(fibo1 + " " + fibo2);
    for(int i = 0 ; i < num ; i++ )
    {
      fibo = fibo1 + fibo2 ;
      System.out.print(" " + fibo);
      fibo1 = fibo2;
      fibo2 = fibo;
    }
  }
}
