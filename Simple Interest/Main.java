import java.util.Scanner;
import java.io.*;

class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
      int p= Integer.parseInt(br.readLine());
      int t= Integer.parseInt(br.readLine());
      float r= Float.parseFloat(br.readLine());
      System.out.printf ("%.2f",(p*r*t)/100);
    }
}