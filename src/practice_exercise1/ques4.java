/**Author's Name         : Sumona Mondal
 * Author's Redg.No      : 2041011261
 * Author's Semester     : 1st
 * Author's Branch-Section: CSIT-2041010
 * Subject                : Introduction To Computer Programming(CSE 1001)
 * Problem Description    : (Question 4)To write a java program to exchange the values of two variables of inte
*/
package practice_exercise1;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		int A,B;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of A and B");
		A=sc.nextInt();
		B=sc.nextInt();
		System.out.println("Numbers A and B before swaping="+A+"  "+B);
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.println("Number A and B after swaping="+A+"  "+B);
	}

}
/*   Output  :
Enter the values of A and B
5
10
Numbers A and B before swaping =5  10
Numbers A and B after swaping =10  5
*/