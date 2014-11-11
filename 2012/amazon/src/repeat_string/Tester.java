package repeat_string;

public class Tester {
	
	public static void main(String[] args)
	{
		String input = "aaaabbbbbccccddddddddddeeffffffffffffffggggggg";
		
		char current_char = input.charAt(0);
		int current =1;
		
		StringBuilder s= new StringBuilder();
		
		
		for(int i = 0; i < input.length(); i++)
		{
			if(current_char == input.charAt(i))
				current ++;
			else
			{
				s.append(current_char);
				s.append(current);
				current = 1;
				current_char = input.charAt(i);
			}
		}
		
		s.append(current_char);
		s.append(current);
		
		
		String output = s.toString();
		
		System.out.println(output);
	}
}
