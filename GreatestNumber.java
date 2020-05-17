import java.util.Scanner;
class GreatestNumber
{
  public static void main(String[] args)
  {
    Scanner s1 = new Scanner(System.in);
    int x = s1.nextByte();
    Scanner s2 = new Scanner(System.in);
    int y = s2.nextByte();
    Scanner s3 = new Scanner(System.in);
    int z = s3.nextByte();
    if((x>y)&&(x>z))
    {
      System.out.print(x);
    }
    if((y>x)&&(y>z))
    {
      System.out.print(y);
    }
    else
    {
      System.out.print(z);
    }
  }
}
