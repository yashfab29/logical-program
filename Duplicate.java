import java.util.Scanner;

public class Duplicate {
	public static void remDup(String s)
	{
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
				for(int j=i+1;j<words.length;j++)
				{
					if(words[i].equals(words[j]))
					{
						words[j]=null;
					}
				}
			}
		}
		for(int i = 0; i<words.length; i++)
			if(words[i]!=null)
				System.out.print(words[i] + " ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		remDup(s);
	}

}
