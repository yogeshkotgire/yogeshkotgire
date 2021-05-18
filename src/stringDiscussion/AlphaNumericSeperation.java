package stringDiscussion;

public class AlphaNumericSeperation {
	public static void main(String[] args) {
		String ss = "bjdfs5fmbdk8uu3o4478345798fkggn";
		
			char[] array = ss.toCharArray();	
			
			String number ="";
			String alpbabets ="";
			for(int i = 0;i<array.length;i++)
			{
				if(Character.isDigit(ss.charAt(i)))
				{
					number=number+ss.charAt(i);
				}
				else
				{
					alpbabets=alpbabets+ss.charAt(i);
				}
			}	
			System.out.println(number);
			System.out.println(alpbabets);
	}
	

}
