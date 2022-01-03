package Functions;

public class Start {
	
	static int move(int pos, int amount) {
		int finalPos = pos + amount;
		return finalPos;
	}

	public static void main(String[] args) {
		int finalPos = move(3, 20);
		System.out.println(finalPos);
	}

}
