import java.util.Scanner;
class FactorialIteration
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = s.nextInt();
    int result = 1 ;
    for(int i = num ; i>=1 ; i--)
    {
      result *= i ;
    }
    System.out.print("Factorial of " + num + " is : " + result);
  }
}
