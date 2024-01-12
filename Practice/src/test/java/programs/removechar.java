package programs;

public class removechar {

	public static void main(String[] args) {
		
		String s="abcdb";
		char c='b';
		String res="";
		
	for(int i=0;i>s.length();i++)
	{
		char temp=s.charAt(i);
		if(c!=temp)
		{
			res+=temp;
		}
	}
	System.out.println(res);
		
	}}