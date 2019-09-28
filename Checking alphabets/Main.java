import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
      char name= (char)br.read();
      if ((name=='a')||(name=='e')||(name=='i')||(name=='o')||(name=='u'))
      {
        System.out.println("Vowel");
      }
      else if((name>=32)&& (name<=64))
      {
        System.out.println("Not an alphabet");
      }
      else
      {
        System.out.println("Consonant");
      }
    }
}