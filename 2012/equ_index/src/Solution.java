
public class Solution {

	public static int equi ( int[] A ){
		if(A == null || A.length == 0)
			return -1;
		
		long sum = 0;
		
		for(int i=0;i<A.length;i++){
			sum = sum + A[i];
		}
		
		long ssum=sum;
		
		sum = 0;
		int index = -1;
		for(int i=0;i<A.length;i++){
			
			
			long half = ssum - A[i];
			
			if(half % 2 != 0){
				sum = sum + A[i];
				continue;
			}
			
			half /= 2;
			
			if(sum == half){
				index = i;
				break;
			}
			sum = sum + A[i];
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {-7, 1, 5, 2, -4, 3, 0};
		
		System.out.print(equi(A));
	}

}
