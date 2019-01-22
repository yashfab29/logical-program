
public class Start {
	public static void startS(String[]s)
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			{
				char a[]=s[i].toCharArray();
				if(a[0]=='s')
					System.out.println(a);
				
			}
		}
	}
	public static void main(String args[])
	{
		String [] s = {"apple","sample","search","monkey"};
		startS(s);
	}

}
