/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);

			// check if the three sides can form a triangle by using the Triangle Inequality Theorem
			boolean isTriangle = (num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1);
			
			System.out.println(args[0] + ", " + args[1] + ", " + args[2] + ": " + isTriangle);
	}
}
