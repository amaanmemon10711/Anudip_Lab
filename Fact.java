/* 1.Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]
 Sample Input 1:
 145
*/
package Demo;
import java.util.Scanner;


public class StrongNumber {

	    // Method to calculate factorial of a digit
	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Parameterized method to check Strong Number
	    static void checkStrong(int num) {
	        int original = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += factorial(digit);
	            num /= 10;
	        }

	        // Conditional operator
	        String result = (sum == original) ? "Strong Number" : "Not a Strong Number";
	        System.out.println(original + " is " + result);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        checkStrong(n);
	    }
	}

/*Enter a number: 145
145 is Strong Number

Enter a number: 100
100 is Not a Strong Number
*/