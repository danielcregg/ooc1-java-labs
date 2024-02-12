package ie.atu.arrays;

import java.util.Arrays;

public class ArrayIntro {
	public static void main(String[] args) {

		// Declaring an Array and assigning memory
		int[] ages = new int[3];
				
		// Populating array
		ages[0] = 19;
		ages[1] = 27;
		ages[2] = 34;
		//ages[3] = 51; // Array index out of bounds
		
		// [19, 27, 34] - The array looks like this
		
		// Print 2nd element of array
		System.out.println(ages[1]);
		
		// Inbuilt array methods - length
		System.out.println(ages.length); 
		
		// // Example 2
		String[] cars = {"Ford", "Nissan", "Toyota", "Tesla"};
		
		// Print 1th element of array by calling the zeroth index
		System.out.println(cars[3]);
		
		System.out.println(cars.length);

		// Print last element of the array
 		System.out.println(cars[cars.length - 1]);
 		
 		// Print all elements of array
 		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
 		// Access and modify all elements of array
		for (int i = 0; i < ages.length; i++) {
			ages[i] = i;
		}
		
 		// Print all elements of array
 		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
	
 		// Prints the hashcode values of the objects but I want to print the values of these object
		System.out.println(ages); 

		// Enhanced For Loop or Java For-Each loop
		for (int age : ages) {
			System.out.println(age);
		}
		
		// Print Array using toString. Need to import Arrays package
		System.out.println(Arrays.toString(ages)); 
		System.out.println(Arrays.toString(cars));

	 	// Create an array that holds all values form 1 to 10 and print it to the console
	 	int[] myArr = new int[10];
	 	for (int i = 0; i < myArr.length; i++) {
	 		myArr[i] = i + 1;
	 	}

	 	System.out.println(Arrays.toString(myArr));

	 	// Array tests
	 	int[] arr = {10, 15, 7, 20, 11, 2};
	 	
	 	int x = -1;
	 	int y = 100;
		int z = 3;

	 	// 1
	 	arr[3] = x;
	 	System.out.println(Arrays.toString(arr));
	 	// 2
	 	x = 2 * arr[0];
	 	System.out.println(x);
	 	// 3
	 	x = arr[1] + arr[2];
	 	System.out.println(x);		
	 	// 4
	 	x = arr[z] + z;
	 	System.out.println(x);
	 	// 5
	 	y = x + arr[5];
	 	System.out.println(y);
	 	// 6
	 	x = arr[z] + 1;		
	 	System.out.println(x);
	 	// 7
	 	y = arr[z + 1];
	 	System.out.println(y);

	 	// Print every second element of the array
	 	for (int i = 0; i < arr.length; i++) {
	 		if (i % 2 == 1) {
	 			continue; // Skip the rest of the code and go to the next iteration
	 		}
	 		System.out.println(arr[i]);
	 	}
		
	 } // End main
} // End class
