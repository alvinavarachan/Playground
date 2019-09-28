import java.util.Scanner;
import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
      String entrance= br.readLine();
        int rail= Integer.parseInt(br.readLine());
      if (entrance. contentEquals("rear")){
          if (rail==1)
             System.out.printf("Right Handed");
          else 
         System.out.printf("Left Handed");
            }else
          {
         if (rail==1)
            System.out.printf("Left Handed");
           else 
           System.out.printf("Right Handed");
          
          }
          
      }
      
	}
