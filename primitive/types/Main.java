package primitive.types;

public class Main {

	public static void main(String[] args) {
		int myVal = 10000;
		int myMinIntVal = Integer.MIN_VALUE;
		int myMaxIntVal = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntVal);
		System.out.println("Integer Maximum Value = " + myMaxIntVal);
		System.out.println("Busted Max Value = " + (myMaxIntVal + 1));
		System.out.println("Busted Min Value = " +( myMinIntVal - 1));
		
		int myMaxIntTest = 2_147_483_647;
		
//Short&Shorts
		
		short myMinShortVal = Short.MIN_VALUE;
		short myMaxShortVal = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortVal);
		System.out.println("Short Maximum Value = " + myMaxShortVal);
		
		/*
		 * Byte occupies 8 bits so we can say it has a width of 8. (i.e. a bit is not diectly rep in a primitive type)
		 * Short can store a larger range and occupies 16 bits so it has a width of 16.
		 * An Int occupies 32 bits.
		 * The ideal is that each primitive type occupies different types of memory.
		 */
		//when using long u can decalre a value is long by adding a capitol L so it won't confuse you or program.
		long myLongVal = 100L; 
		long myMinLongVal = Long.MIN_VALUE;
		long myMaxLongVal = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongVal);
		System.out.println("Long Maximum Value = " + myMaxLongVal);
		//See what I mean about L
		long bigLongLiteralVal = 2_147_483_647L;
		System.out.println(bigLongLiteralVal);
		
		short bigShortLiteralVal = 32767;
		
		//Casting
		int myTotal = (myMinIntVal / 2);
		
		//At first without cast it will show an error. We place the type of cast at the beginning of the value.
		//byte myNewByteVal = (myMinByteVal / 2);
		//byte myNewByteVal = (byte) (myMinByteVal / 2);
		short myNewShortVal = (short)(myMinShortVal / 2);
		
/*Challenge
 * Create a byte variable and set it to any valid byte number, it doesn't matter. 
 * Create a short variable and set it to any valid short number.
 * Create an int var and set it to any valid int num. 
 * Lastly, create a var of type long equal to 50000 plus 10 times the sum of the byte plus
 * the interger values.
 * */
		byte byteVal = 30;
		short shortVal = 60;
		int myIntVal = 100;
		
		long longChallTotal = 50000L + 10L * ( byteVal + shortVal + myIntVal);
		System.out.println(longChallTotal);
		
		
		short shortChallTotal = (short) (1000 + 10 * ( byteVal + shortVal + myIntVal));
		System.out.println(shortChallTotal);
		
		
	}

}
