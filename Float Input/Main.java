import java.io.*;
import java.io.BufferedReader;
class Main
{
    public static void main(String args[])  throws IOException
    {
       BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
      float a = Float.parseFloat(br.readLine());
      System.out.printf ("%.2f",a);
      
        
    }
}