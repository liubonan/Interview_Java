import java.math.BigInteger;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger[] a = new BigInteger[1000000];
		//BigDecimal[] b = new BigDecimal[50000];
		a[0]=BigInteger.ONE;
		a[1]=BigInteger.ONE;
		
		for(int i=2; i<100000;i++){
			a[i]=a[i-1].add(a[i-2]);
			
		}
		
		System.out.println(a[99999].toString().length());
		
		
		
		
	}

}
