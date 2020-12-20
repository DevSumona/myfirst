/**Author's Name         : Sumona Mondal
 * Author's Redg.No      : 2041011261
 * Author's Semester     : 1st
 * Author's Branch-Section: CSIT-2041010
 * Subject                : Introduction To Computer Programming(CSE 1001)
 * Problem Description    : (Question 10) To diplay the result of [4*[1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)]] and [4*[1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13)]]
 */
package practice_exercise1;

public class ques10 {

	public static void main(String[] args) {
		final double a=1.0,b,c;
		b=(4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11)));
		c=(4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11)+(a/13)));
		System.out.println(" The result for (4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11))) is= "+b);
		System.out.println(" The result for (4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11)+(a/13)) is= "+c);
		
		

	}

}
/*   Output  : 
 *  The result for (4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11))) is= 2.9760461760461765
 The result for (4*(a-(a/3)+(a/5)-(a/7)+(a/9)-(a/11)+(a/13)) is= 3.2837384837384844 
 */
    