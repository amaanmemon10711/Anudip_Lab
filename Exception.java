/*2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
(Hint: Use array and loop and try to access the element beyond the last index)*/
package Demo;

public class Access {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		try {
			for (int i = 0; i <= arr.length; i++) { // Notice <= goes out of bounds
				System.out.println("Element at index " + i + ": " + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds.");
		}
	}
}

/*Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
Error: Array index out of bounds.*/