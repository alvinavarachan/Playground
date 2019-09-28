import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
      String type=br.readLine();
      float fee=0;
             int tution= Integer.parseInt(br.readLine());
             int bus= Integer.parseInt(br.readLine());
             int hostel= Integer.parseInt(br.readLine());
      switch (type)
      {
        case "MSH":
          {
            fee=tution+hostel;
            break;
          }
      case "MSDS":
      {
        fee=tution+bus;
        break;
      }
      
        case "MGSH":
      {
        float newtution= (float)(tution*150/100);
        fee=(float)newtution+hostel;
            break;
      }
      case "MGSDS":
          {
             float newtution= (float)(tution*150/100);
            fee=(float)newtution+bus;
             break;
          }
      }
      System.out.printf("%.2f",fee);
      
    }
}