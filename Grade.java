import java.util.Scanner;
public class Grade {
	public static void gradeS(int n)
	{
		if(n>60)
		{
			System.out.println("passed with 1st division");
		}
		else if(n>=50&&n<=60)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int n=sc.nextInt();
		gradeS(n);
	}

}
