package soj1002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main{

	/**
	 * @param args
	 */
	
	public static String plus(String input)
	{
		StringTokenizer st = new StringTokenizer(input);
		String a = st.nextToken();
		String b = st.nextToken();
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		

		
		ArrayList<Integer> r;
		
		int topflag = 0;
		
		int la = a.length();
		int lb = b.length();
		
		for(int i=0;i < la;i++)
			a1.add(a.charAt(i)-'0');
		
		for(int i=0;i < lb;i++)
			b1.add(b.charAt(i)-'0');
		
		if(la >= lb)
		{
			int k = la - lb;
			r = new ArrayList<Integer>(a1);
			
			for(int i=lb-1;i>=0;i--)
			{
				int temp = a1.get(i+k)+b1.get(i);
				
				if(i+k-1 < 0 && temp>=10)
					topflag = 1;
				else
				{
					a1.set(i+k-1, r.get(i+k-1)+(int)(temp/10));	
					r.set(i+k, temp % 10);
				}
				
			}
				
		}
		else
		{
			int k = lb - la;
			r = new ArrayList<Integer>(b1);
			
			for(int i=la-1;i>=0;i--)
			{
				int temp = a1.get(i)+b1.get(i+k);
				
				if(i+k-1 < 0  && temp>=10)
					topflag = 1;
				else
				{
					b1.set(i+k-1,r.get(i+k-1)+(int)(temp/10));			
					r.set(i+k, temp % 10);
				}
			}
			
		}
		
		
		
		StringBuilder result = new StringBuilder();
		
		if(topflag == 1)
			result.append("1");
		
		for(int i = 0; i < r.size();i++)		
		    result.append(Integer.toString(r.get(i)));
		
		return result.toString();
	}
	
	
	public static void main(String[] args)  throws Exception
	
	{
		// TODO Auto-generated method stub
	
		InputStreamReader   stdinn   =   new   InputStreamReader(System.in);
		BufferedReader   bufin   =   new   BufferedReader(stdinn);

		while(true)
		{
			String str   =   bufin.readLine(); 
			if(str == null) break;		
			
			System.out.println(plus(str));
		}
		
	}

}
