package sol;

public class Sol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[98];
		
		for(int i=1;i<=72;i++)
			num[i-1]=i;
		
		for(int i=75;i<=100;i++)
			num[i-3]=i;
		
		int value=num[0]^1;
		
		for(int i =2;i<=98;i++){
			value = value ^ num[i-1]^i;
		}
		value ^= 99;
		value ^= 100;
		
		int x=0;
		int y=0;
		
		int t = 1;
		
		while((t & value) == 0)
			t = t << 1;
		
		for(int i=1;i<=100;i++){
			if((i & t) == 0){
				x ^= i;
			}
			else
				y^=i;
		}
		
		for(int i = 0;i<=97;i++){
			if((num[i] & t) == 0){
				x ^= num[i];
			}
			else
				y^=num[i];
		}
		
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x^y);

	}

}
