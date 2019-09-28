import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      int side= Integer.parseInt (br.readLine());
      System.out.println (side*side);
      int length= Integer.parseInt (br.readLine());
      int breadth= Integer.parseInt (br.readLine());
      System.out.println (length*breadth);
      float radius= Float.parseFloat (br.readLine());
       System.out.printf ("%.3f", 3.14*radius*radius);
      
      
    }
}