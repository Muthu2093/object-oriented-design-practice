public abstract class products{

	public static Map<String, Integer> productMap;

	public products(){
		productMap = new HashMap<>();
		productMap.add("candy", 5);
		productMap.add("snacks" , 50);
		productMap.add("nuts", 90);
		productMap.add("coke", 90);
		productMap.add("pepsi", 90);
		productMap.add("soda", 90);
	}

}