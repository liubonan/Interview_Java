package sol;

import java.util.HashMap;

public class MyHash extends HashMap<String,Integer>{
	private HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	public void put(String key){
		Integer exist = this.get(key);
		if(exist == null){
			super.put(key, 1);
			map.put(key, 1);
		}
		else if(exist == -1){
			
		}
		else{
			super.put(key,-1);
			map.remove(key);
		}
	}
	
	public String get_unique(){
		if(map.keySet() == null || map.keySet().size() == 0){
			return null;
		}
		else{
			return (String) (map.keySet().toArray())[0];
		}
	}
}
