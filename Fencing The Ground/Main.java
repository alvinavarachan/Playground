import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner (System.in);
    int length= sc.nextInt();
    int breadth= sc.nextInt();
    System.out.println (2*(length+breadth) +"m");
    System.out.println (length*breadth +"sqm");
  }
}