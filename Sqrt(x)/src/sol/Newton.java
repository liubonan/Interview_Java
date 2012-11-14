package sol;

public class Newton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Newton().sqrt(5));
	}
	
	public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double curr=x,prev=0;
		while(Math.abs(curr - prev) > 0.01){
			prev = curr;
			curr = (prev - (prev*prev - x)/(2 * prev));
		}
		return (int)curr;
    }

}
