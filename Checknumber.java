import java.util.Scanner;
class Checknumber
{
	public static void main (String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Whether a Number is Positive or Negative");	
		int no=sc.nextInt();
		if(no>0)
			{
				System.out.println("Entered Number is Positive");
			}
		else
			{
				System.out.println("Entered Number is Negative");
			}

		}

}