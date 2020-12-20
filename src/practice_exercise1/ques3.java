/**Author's Name         : Sumona Mondal
 * Author's Redg.No      : 2041011261
 * Author's Semester     : 1st
 * Author's Branch-Section: CSIT-2041010
 * Subject                : Introduction To Computer Programming(CSE 1001)
 * Problem Description    : (Question 3)To write a java program to exchange the values of two variables of integer type A and B using third temporary variable C
*/
package practice_exercise1;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int A,B;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		A=sc.nextInt();
		System.out.println("Enter the value of B");
		B=sc.nextInt();
		System.out.println("The values of numbers before swaping are A="+A+"and B="+B);
		int C=A;
		A=B;
		B=C;
		System.out.println("The values of A and B after swaping are A="+A+" B="+B);

	}

}
/*   Output  :
 * The values of numbers before swaping are A=10 and B=20
 * The values of A and B after swaping are A=20 and B=10 
 */
  