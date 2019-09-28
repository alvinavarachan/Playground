import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      int ba= Integer.parseInt (br.readLine());
      int po= Integer.parseInt (br.readLine());
      System.out.println ((int)Math.pow(ba,po));
    }
}