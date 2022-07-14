
class Multiple35
{
	public static void main(String args[])
		{
		System.out.println("Enter numbers from 1 to 100");
		
		for(int i=1;i<=100;i++)
			{
				if(i%3==0 && i%5==0)
				{		
				System.out.println("DeepTech");
				}
			else if(i%3==0)
				{
				System.out.println("Tech");
				}
			else if(i%5==0 )   
				{
				System.out.println("Deep");
				}
			else
				{
				System.out.println(+i);
				}
			}

		}



}