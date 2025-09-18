/*2.Write a program to check leap year using if else. How to check whether a given year
 is a leap year or not.
 [Hint:Take an input of any number. Store it in some variable say year.
 If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a
 year is exactly divisible by 400 then it is a leap year.]
 Sample Input 1:
 2004*/
package Demo;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input year
		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		// Check leap year condition
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year.");
		} else {
			System.out.println(year + " is NOT a Leap Year.");
		}
	}
}

/*Enter a year: 2000
2000 is a Leap Year.

Enter a year: 2022
2022 is NOT a Leap Year.
*/