package stringDiscussion;

public class FindNoOfStrings {
	public static void main(String[] args) 
	{
		String s="yogahjjdfjyogahvvlkjfdhyogalkjjhkjjyogajjhljkfdhgljhyoga";
		String b="yoga";
		int num=0;
	//	char[] ss = s.toCharArray();
		
		String[] c = s.split(b);
//		for(String abc:c)
//		{
//			System.out.println(abc);
//		}
		
		for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]);
			 num=i+1;// we can take this also ++i --bcoz index start with 0
		}
			
		System.out.println(num);

		
	}

}
