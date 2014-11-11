package reserve_list;

public class Tester2 {
	
	public static void main(String[] args)
	{
		String s = "abcdefg";
		StringBuffer ss = new StringBuffer();
		
		for(int i = s.length() -1;i >=0;i--)
		{
			ss.append(s.charAt(i));
		}
		
		System.out.print(ss.toString());
	}

}
