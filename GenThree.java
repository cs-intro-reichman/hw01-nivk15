/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.lang.Math;


public class GenThree {
	public static void main(String[] args) {
			int min = Integer.parseInt(args[0]);
			int max = Integer.parseInt(args[1]);

			/* Math.random() generate random double number in the range [0,1), then we'll multiply it by the 
			 * differance (max - min) in order to get a number in the range [0, max-min) . and then we will cast it to type int to 
			 * remove the decimal part. and lastly we'll add it to min to get a random number in the range [min, max) 
			 */
			int randNum1 = min + (int)(Math.random() * (max - min));
			int randNum2 = min + (int)(Math.random() * (max - min));
			int randNum3 = min + (int)(Math.random() * (max - min));
			
			// print the 3 random numbers that the program generated
			System.out.println(randNum1);
			System.out.println(randNum2);
			System.out.println(randNum3);

			// print the minimum number out of the 3 random numbers that were generated
			if ((randNum1 <= randNum2) && (randNum1 <= randNum3)) {
					System.out.println("The minimal generated number was " + randNum1);
			}
			else if ((randNum2 <= randNum1) && (randNum2 <= randNum3)) {
					System.out.println("The minimal generated number was " + randNum2);
			}
			else 
					System.out.println("The minimal generated number was " + randNum3);
	}
}
