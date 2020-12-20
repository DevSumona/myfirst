/**Author's Name         : Sumona Mondal
 * Author's Redg.No      : 2041011261
 * Author's Semester     : 1st
 * Author's Branch-Section: CSIT-2041010
 * Subject                : Introduction To Computer Programming(CSE 1001)
 * Problem Description    : (Question 6) To write a java program to print the multiplication table (upto 10 ) of any number.
*/
package practice_exercise1;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to display it's multiplication table");
		a=sc.nextInt();
		System.out.println(a+" * 1 = "+a*1);
		System.out.println(a+" * 2 = "+a*2);
		System.out.println(a+" * 3 = "+a*3);
		System.out.println(a+" * 4 = "+a*4);
		System.out.println(a+" * 5 = "+a*5);
		System.out.println(a+" * 6 = "+a*6);
		System.out.println(a+" * 7 = "+a*7);
		System.out.println(a+" * 8 = "+a*8);
		System.out.println(a+" * 9 = "+a*9);
		System.out.println(a+" * 10 = "+a*10);

	}

}
/*   Output   :
Enter a number to display it's multiplication table
5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
*/