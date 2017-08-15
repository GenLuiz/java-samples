package exercise1;

public class GlobalCounter {
	
	private GlobalCounter(){}
	
	private static int number =1;
	
	private static GlobalCounter instance = new GlobalCounter();
	
	public static GlobalCounter getInstance(){
			return instance;		
	}

	public static void increase(){
		number++;
	}
	
	public static int getNumber(){
		return number;
	}
}