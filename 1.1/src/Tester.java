import java.util.ArrayList;
import java.util.List;


public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "asdfawelvkjasiupwaer";
		String test2 ="difocpxlwe,38290";
		
		List<String> l = new ArrayList<String>();
		
		boolean  flag = false;		
		for(int i = 0; i < test1.length();i++)
		{
			
			for(String j : l)
			{
				if(j.charAt(0) == test1.charAt(i))
				{
					System.out.println("No!");
					flag = true;
					break;
				}

			}
			
			if(flag) break;
			else l.add(Character.toString(test1.charAt(i)));
		}
		
		if(!flag) System.out.println("Yes");
		
		flag = false;
		l = new ArrayList<String>();


		
		for(int i = 0; i < test2.length();i++)
		{

			for(String j : l)
			{
				if(j.charAt(0) == test2.charAt(i))
				{
					System.out.println("No!");
					flag = true;
					break;
				}			
			}			
			
			if(flag) break;
			else l.add(Character.toString(test2.charAt(i)));
		}
		
		if(!flag) System.out.println("Yes");
		

	}

}
