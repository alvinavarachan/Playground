import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner (System.in);
    int x1= sc.nextInt();
    int y1= sc.nextInt();
    int x2= sc.nextInt();
    int y2= sc.nextInt();
    float x3= (float)(x1+x2)/2;
    float y3= (float)(y1+y2)/2;
    System.out.printf ("Binoy's house is located at (%.1f,%.1f)",x3,y3);
    
  }
}