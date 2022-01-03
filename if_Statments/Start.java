package if_Statments;

public class Start {

	public static void main(String[] args) {
		
		int pos = 2;
		String keyStroke = "r";
		
		if (keyStroke.contentEquals("r")) {
			pos += 1;
			System.out.println(pos);
		} else if (keyStroke.equals("l")){
			pos -= 1;
			System.out.println(pos);
		}
		else {
			System.out.println("Unknown Command");
		}
	}

}
