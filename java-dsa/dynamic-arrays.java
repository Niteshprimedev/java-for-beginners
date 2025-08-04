// ArrayList (Dynamic Array)

import java.util.ArrayList;

// Creating an ArrayList
ArrayList<Integer> list = new ArrayList<>(); // Create an empty ArrayList
list.add(1); // Adding elements
list.add(2); // Adding more elements
list.add(3); // Adding more elements

// Accessing elements in an ArrayList
int firstElementList = list.get(0); // Accessing the first element
int lastElementList = list.get(list.size() - 1); // Accessing the last element

// Modifying elements in an ArrayList
list.set(0, 100); // Changing the first element to 100

// Iterating through an ArrayList
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i)); // Print each element
}

// Enhanced for loop for ArrayList
for (int num : list) {  
    System.out.println(num); // Print each element
}

// Common ArrayList Operations
// Finding the size of an ArrayList
int size = list.size(); // Size of the ArrayList

// Checking if an ArrayList is empty
boolean isEmptyList = list.isEmpty(); // Check if the ArrayList is empty

// Removing an element from an ArrayList
list.remove(1); // Removes the element at index 1

// Clearing an ArrayList
list.clear(); // Removes all elements from the ArrayList

// Converting an ArrayList to an array
Integer[] arrayFromList = list.toArray(new Integer[0]); // Converts the ArrayList

// to an array of Integer type
// Sorting an ArrayList
Collections.sort(list); // Sorts the ArrayList in ascending order

// Searching for an element in an ArrayList
int indexList = list.indexOf(2); // Searches for the element 2 and returns its index

// Checking if an ArrayList contains an element
boolean contains = list.contains(3); // Checks if the ArrayList contains the element 3

// Converting an ArrayList to a string
String listString = list.toString(); // Converts the ArrayList to a string representation

// Cloning an ArrayList
ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone(); // Creates a shallow

// Checking equality of ArrayLists
boolean areListsEqual = list.equals(clonedList); // Checks if two ArrayLists are equal

// ArrayList (Dynamic Array) Multidimensional Example
ArrayList<ArrayList<Integer>> dynamicMatrix = new ArrayList<>();

// Initializing a 2D ArrayList
for (int i = 0; i < 3; i++) {
    dynamicMatrix.add(new ArrayList<>()); // Adding a new row
}

// Adding elements to the 2D ArrayList
dynamicMatrix.get(0).add(1);
dynamicMatrix.get(0).add(2);
dynamicMatrix.get(0).add(3);

// Accessing elements in 2D ArrayList
int firstElement = dynamicMatrix.get(0).get(0); // Accessing first element of the first row
int lastElement = dynamicMatrix.get(2).get(2); // Accessing last element of the last row

// Modifying elements in 2D ArrayList
dynamicMatrix.get(0).set(0, 10); // Changing the first element of the first row to 10

// Enhanced for loop for 2D ArrayList
for (ArrayList<Integer> row : dynamicMatrix) {  
    for (int num : row) {
        System.out.print(num + " "); // Print each element in the row
    }
    System.out.println(); // New line after each row
}   

// Common ArrayList Operations for 2D ArrayList
// Finding the size of a 2D ArrayList
int rows = dynamicMatrix.size(); // Number of rows in the 2D ArrayList  
int cols = dynamicMatrix.get(0).size(); // Number of columns in the first row

// Checking if a 2D ArrayList is empty
boolean isEmpty2D = dynamicMatrix.isEmpty(); // Check if the 2D ArrayList is empty

// Removing an element from a 2D ArrayList
dynamicMatrix.get(0).remove(1); // Removes the element at index 1 in the first row

// Clearing a 2D ArrayList
dynamicMatrix.clear(); // Removes all elements from the 2D ArrayList

// Converting a 2D ArrayList to an array
ArrayList<Integer>[] arrayFrom2DList = dynamicMatrix.toArray(new ArrayList[0]); // Converts the 2D ArrayList to an array of ArrayLists

// Sorting a 2D ArrayList
for (ArrayList<Integer> row : dynamicMatrix) {
    Collections.sort(row); // Sorts each row in ascending order
}   