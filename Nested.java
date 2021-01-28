import java.util.Scanner;
public class Nested
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the year you want to check");
		int year=obj.nextInt();
		obj.close();
		if(year/4==0)
		{
			if(year/100==0)
			{
				if(year/400==0)
				{
					System.out.println(year + "is a leap year");
				else {
					System.out.println(year+ "is not leap year");
					}
				}
				System.out.println(year+"is a leap year");
			else
			{
			System.out.println(year+"is not the leap year");
			}
			}
			System.out.println(year+"is a leap year");
		else
		{
			System.out.println(year+"is not a leap year");
		}
	}
}
}