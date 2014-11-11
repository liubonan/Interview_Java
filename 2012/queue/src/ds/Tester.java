package ds;

public class Tester {
	
	public static void main(String[] args)
	{
		Queue q= new Queue();
		String test = "abcdefghijklmn";
		
		q.init(test.charAt(0));	
		
		for(int i = 1; i < test.length(); i++)
			q.push(test.charAt(i));
		
		while(!q.empty())
		{
			System.out.print(q.peek()+" ");
			System.out.print(q.pop() + " ");
		}
	}

}
