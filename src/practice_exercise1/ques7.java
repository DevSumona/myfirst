/**Author's Name         : Sumona Mondal
 * Author's Redg.No      : 2041011261
 * Author's Semester     : 1st
 * Author's Branch-Section: CSIT-2041010
 * Subject                : Introduction To Computer Programming(CSE 1001)
 * Problem Description    : (Question 7)To write a java program to display a table.
 */
package practice_exercise1;

public class ques7 {

	public static void main(String[] args) {
		double a=1,b=2,c=3,d=4;
			System.out.println(" a      a^2      a^3");
			System.out.println(" "+a+"      "+(Math.pow(a, 2))+"      "+(Math.pow(a, 3)));
			System.out.println(" "+b+"      "+(Math.pow(b, 2))+"      "+(Math.pow(b, 3)));
			System.out.println(" "+c+"      "+(Math.pow(c, 2))+"      "+(Math.pow(c, 3)));
			System.out.println(" "+d+"      "+(Math.pow(d, 2))+"      "+(Math.pow(d, 3)));
	}

}
/*    Output  :
 *  a      a^2      a^3
 1.0      1.0      1.0
 2.0      4.0      8.0
 3.0      9.0      27.0
 4.0      16.0      64.0
 */
