package Operators;
/*
 * What's covered
 * - Arithmetic 
 * - Comparison
 * - Logical
 */
public class Start {

	public static void main(String[] args) {
		//Assignment:
		int health = 100;
		String firstName = "Joshua";
		
		//Arithmetic: + - * / %
		int newHealth = health + 20;
		health = health +20;
		health += 20;
		String fullName = firstName +"Is Awesome SWE!";
		
		//Comparison: == != >= > < <=
		double accountBal = 100.25;
		double cost = 50d;
		boolean canAfford = accountBal >= cost;
		
		//String have their own opterator is equal.
		System.out.println(firstName.equals("Is Awesome SWE!"));
		
		
		//Logical: && || !
		int numLives = 5;
		boolean isAlive = numLives > 0 && health > 0;
		boolean isDead = !isAlive;

	}

}
