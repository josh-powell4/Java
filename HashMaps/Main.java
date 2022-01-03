package HashMaps;
import java.util.HashMap;
/*
 * What's covered
 * - Create HashMaps
 * - Common Ops
 * - Get/Set HashMap elements
 */
public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> inventory = new HashMap<>();
		inventory.put("Key", 2);
		inventory.put("Axe", 3);
		inventory.put("Matches", 1);
		
		int numKeys = inventory.get("Key");
		inventory.put("Matches", 2);
		inventory.replace("Matches", 1);
		
	}

}
