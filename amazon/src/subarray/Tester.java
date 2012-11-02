package subarray;

import java.util.Random;

public class Tester {
	
	public static void main(String[] args)
	{
	
		int k = 7;
		int[] arr = new int[50];
		int ssum = 35;
		
		Random r=new Random();
		
		for(int i=0;i< 50;i++)
		{
			arr[i] = r.nextInt(10);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		boolean flag = false;
		
		int sum = 0;
		for(int i= 0;i<k;i++)
			sum += arr[i];
		
		if(sum == ssum)
			flag = true;
		
		int i = k;
		int j = 0;
		while(!flag && (i < 50))
		{
			sum += arr[i];
			sum -= arr[j];
			
			if(sum == ssum)
			{
				flag = true;
				for(j = j+1;j <= i;j++)
					System.out.print(arr[j]+" ");
			}
			else
			{
				j++;
				i++;
			}
		}
		
		if(!flag)
			System.out.print(-1);
		
	}
}
