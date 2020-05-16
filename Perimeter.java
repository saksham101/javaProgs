import java.util.Scanner; 
class Perimeter
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    double radius = s.nextByte();
    double perimeter ;
    double area ;
    if(radius<0)
    {
      System.out.print("Enter non-zero positive number");
    }
    else
    {
      perimeter = (2*Math.PI*radius) ;
      System.out.println(perimeter) ;
      area = (Math.PI*radius*radius) ;
      System.out.println(area) ;
    }
  }
}
