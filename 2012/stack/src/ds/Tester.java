package ds;

public class Tester {
	
	static public void main(String[] args)
	{
		Stack s = new Stack(0);
		
		for(int i=1;i<=10;i++)
			s.push(i);
		
		while(!s.empty())
			System.out.print(s.pop()+" ");
	}

}
