package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stuff = {"Joshua", "is", "best", "best", "person!"};
		System.out.println(stuff[2]);
		stuff[2] = "the";
		System.out.println(stuff[2]);
		for (int i = 0; i < 5; i++) {
			System.out.println(stuff[i]);
		}
		int min = 100;
		int max = -100;
		int[] smth = new int[50];
		for (int i = 0; i < 50; i++) {
			int rand = new Random().nextInt(100);
			smth[i] = rand;
			if (rand < min) {
				min = rand;
			}
			if (rand > max) {
				max = rand;
			}
		}
		System.out.println("Smallest is " + min);
		System.out.println("Biggest is " + max);
		for (int i : smth) {
			System.out.println(i);
		}
		//2. print the third element in the array
		
		//3. set the third element to a different value
		
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
