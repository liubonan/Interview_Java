package sol;

public class Sol {
	
	public static char[] count_sort(char [] input){
		int [] count = new int[26];
		int total = 0;
		
		for(int i=0;i<count.length;i++){
			count[i] = 0;
		}
		
		for(int i=0;i<input.length;i++){
			int index = input[i] - 'a';
			count[index]++;
			total++;
		}
		
		char [] output = new char[total];
		
		int k=0;
		
		for(int i = 0;i<count.length;i++){
			while((count[i]--) != 0){
				output[k] = (char) ('a'+i); 
				k++;
			}
		}
		return output;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a ={'a','g','h','z','b','g','h'};
		char[] b = count_sort(a);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
		
	}

}
