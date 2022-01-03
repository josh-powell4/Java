
package Arrays;

import java.util.ArrayList;
/*
 * What's covered
 * - Create ArrayLists
 * - Common ArrayList Ops
 */


public class Lists {

	public static void main(String[] args) {
		ArrayList<String> backPack = new ArrayList<>();
		backPack.add("Crowbar");
		backPack.add("Boots");
		backPack.add("Bread");
		
		backPack.get(0);
		backPack.set(1, "Gloves");
		
		backPack.remove(0);
		backPack.remove("Bread");

	}

}
