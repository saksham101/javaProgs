import java.util.Scanner;
class EvenOddNum
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if(num % 2 == 0)
    {
      System.out.print(num + " is Even Number");
    }
    else
    {
      System.out.print(num + " is Odd Number");
    }  
  }
}
