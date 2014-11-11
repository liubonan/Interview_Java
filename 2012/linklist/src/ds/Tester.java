package ds;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linklist l = new Linklist();
		for(int i=0;i<10;i++)
			l.add(i);
		
		for(int i=0;i<10;i++)
			System.out.print(l.getdata(i)+" ");
		
		System.out.println();
		System.out.println(l.getdata(5));
		
		l.deletehead();
		for(int i=0;i<9;i++)
			System.out.print(l.getdata(i)+" ");
		System.out.println();
		
		l.deletetail();
		for(int i=0;i<8;i++)
			System.out.print(l.getdata(i)+" ");
		System.out.println();
		
		l.delete(3);
		for(int i=0;i<7;i++)
			System.out.print(l.getdata(i)+" ");
	}

}
