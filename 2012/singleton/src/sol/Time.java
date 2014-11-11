package sol;

public class Time {
	
	private int data = 0;
	private static Time instance;
	
	private Time(){}
	
	public static Time getInstance(){
		if(instance == null){
			instance = new Time();
		}
		else{
			instance.setData(instance.getData()+1);
		}
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
