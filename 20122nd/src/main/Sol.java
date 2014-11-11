package main;

public class Sol {
	
	public static void main(String[] args){
		int[] a ={1,7,8,4,15,13,5,6,9,10,2,3};
		System.out.println(get2nd(a));
		
	}
	
	public static int get2nd(int[] array){
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		
		for(int i:array){
			if(i > first){
				second = first;
				first = i;				
			}
			else if(i > second){
				second = i;
			}
			else {
				continue;
			}
		}
		
		return second;
	}

}
