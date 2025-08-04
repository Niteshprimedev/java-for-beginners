// Arrays are Linear Data Structures

// Declaring Java Arrays - 1D Arrays

int[] nums = new int[10]; // Array of size 10
int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array with initial values
int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Explicit array initialization

// Accessing Array Elements
int firstElement = nums[0]; // Accessing the first element
int lastElement = nums[nums.length - 1]; // Accessing the last element

// Modifying Array Elements
nums[0] = 100; // Changing the first element to 100

// Iterating through an Array
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]); // Print each element
}

// Enhanced for loop (for-each loop)
for (int num : nums) {  
    System.out.println(num); // Print each element
}   

// Multidimensional Arrays
int[][] matrix = new int[3][3]; // 2D array of size 3x3
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
}; // 2D array with initial values

// Accessing 2D Array Elements
int element = matrix[1][2]; // Accessing element at row 1, column 2

// Modifying 2D Array Elements
matrix[0][0] = 10; // Changing the first element of the first row to 10

// Iterating through a 2D Array
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " "); // Print each element in the row
    }
    System.out.println(); // New line after each row
}

// Enhanced for loop for 2D Arrays
for (int[] row : matrix) {  
    for (int num : row) {
        System.out.print(num + " "); // Print each element in the row
    }
    System.out.println(); // New line after each row
}

// Common Array Operations
// Finding the length of an array
int length = nums.length; // Length of the array

// Checking if an array is empty
boolean isEmpty = nums.length == 0; // Check if the array is empty

// Copying an array
int[] copy = new int[nums.length]; // Create a new array of the same size
System.arraycopy(nums, 0, copy, 0, nums.length); // Copy elements from nums to copy

// Array methods
import java.util.Arrays;

// Sorting an array
Arrays.sort(nums); // Sorts the array in ascending order

// Searching for an element
int index = Arrays.binarySearch(nums, 5); // Searches for the element 5 in the sorted array

// Filling an array with a specific value
Arrays.fill(nums, 0); // Fills the entire array with 0

// Converting an array to a string
String arrayString = Arrays.toString(nums); // Converts the array to a string representation

// Cloning an array
int[] clonedArray = nums.clone(); // Creates a shallow copy of the array

// Checking equality of arrays
boolean areEqual = Arrays.equals(nums, clonedArray); // Checks if two arrays are equal

