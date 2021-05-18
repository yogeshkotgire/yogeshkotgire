package stringDiscussion;

public class Practice {
	public static void main(String[] args) 
	{
		String s="yogahjjdfjyogahvvlkjfdhyogalkjjhkjjyogajjhljkfgdhljhyoga";
		String b="yoga";
		int num=0;
		String d ="";
		char yk;
		ref: for(int i=0;i<s.length();i++)
		{	

			yk = s.charAt(i);
			for (int j= 0;j<b.length();j++)
			{
				if(s.charAt(i)==b.charAt(j))
				{
					System.out.print(s.charAt(i));
					
					
				}
			}
		}
		
}
}



