
public class Solution {

	public static int visible ( Tree T ) {
	      return count(T,Integer.MIN_VALUE);    
	  }
	  
	  public static int count(Tree T, int max){
	      if(T == null){
	          return 0;
	      }
	      else{
	          if(T.x >= max){
	              return count(T.l,T.x)+count(T.r,T.x)+1;
	          }
	          else{
	              return count(T.l,max)+count(T.r,max);
	          }
	      }  
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(visible(null));
	}

}
