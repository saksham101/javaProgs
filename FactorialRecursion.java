import java.util.Scanner;
class FactorialRecursion
{
  static int Factorial(int n)
  {
    if(n==1)
      return 1 ;
    else
      return(n*Factorial(n-1)) ;
  }
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = s.nextInt();
    System.out.print(Factorial(num)); 
  }
}
