import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int rifle= sc. nextInt();
      int visual= sc. nextInt();
      int auditory= sc. nextInt();
      int arms= sc. nextInt();
      int legs= sc. nextInt();
     float ri=350.34f;
      float vi=230.90f;
      float au=190.55f;
      float ar=125.30f;
      float le=180.90f;
      
      float total= (rifle*ri)+(visual*vi)+(auditory*au)+(arms*ar)+(legs*le);
      if (total<=15000)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	}
}