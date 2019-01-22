import java.util.Scanner;
import java.util.Arrays;
public class Weight {
	public static void sumWeight(String s)
	{
		int sum=0;
		char a[]=s.toLowerCase().toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int b=(int)a[i];
			b=b-96;
			sum=sum+b;
		}
		System.out.println("the weight is = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		sumWeight(s);
	}
	

}
