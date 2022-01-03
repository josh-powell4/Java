package Class_Objects;


	
	class GameCharacter {
		String player;
		int pos;
		int health;
		
		GameCharacter(String player, int pos, int health) {
			this.player = player;
			this.pos = pos;
			this.health = health;
		}
		void move(int amount) {
			this.pos += amount;
		}
	}
	
public class Start {
	public static void main(String[] args) {
		GameCharacter gc = new GameCharacter("Luke Skywalker", 0, 100); 
		gc.health = 300;
		gc.move(10);
		System.out.println(gc.health);
		System.out.println(gc.pos);
	}

}
