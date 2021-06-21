public class Pattern1
{
	public static void main(String[] args)
	{

		int rows = 9;
		System.out.println("* Printing the pattern... *");
		System.out.println("0");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = i; j <= rows; j++)
             { System.out.print(j); }
              
             System.out.print("0"); 
              for (int k = rows; k >= i; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}