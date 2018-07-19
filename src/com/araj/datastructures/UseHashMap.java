
import java.util.HashMap;

class UseHashMap {


	public static void main(String[] args) { 

	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	hashMap.put("Anthony", 100);
	hashMap.put("Jennifer", 200);
	hashMap.put("Joanne", 300);

	System.out.println(hashMap);

	for(String key: hashMap.keySet()) {
		System.out.println(key + ":" + hashMap.get(key));	
		}
	}

	for (<String,Integer> k,v: hashMap) {
		System.out.println(k + ":" + v);	
	}
}
