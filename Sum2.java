
import java.util.Scanner;
class Sum2
	{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		int rem,sum=0;
			while(no!=0)
			{
				rem=no%10;
				sum=sum+rem;
				no=no/10;	
			}
		System.out.println("The Sum of Digits :"+sum);

		}
	}