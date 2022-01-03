package forLoops;

public class Main {

	public static void main(String[] args) {
		String[] backPack = {"Knife", "Bandage", "Boots", "Pants", "Shirt", "Jacket" };
		for (int i = 0; i < 3; i += 1) {
			String item = backPack[i];
			System.out.println(item);
		}
	}

}
