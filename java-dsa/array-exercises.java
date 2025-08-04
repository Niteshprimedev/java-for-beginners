// Exercise1 - Given an array, reverse it.
// Exercise2 - Given an array, swap adjacent elements.
// Exercise3 - Create a student class that returns student's total mark, average marks, maximum mark, minimum mark, and the number of subjects.

/*
Input Format
The first line contains n denoting the size of array.
The second line contains n integers denoting the elements of the array.

Output Format
One line containing the n numbers of the array in reverse order
*/

import java.util.*;
class ArraysExercises
{

    private static void swapAdjacentElements(String[] numsArr, int N) {
        int currIdx = 0;
        int nextIdx = 1;

        while(nextIdx < N){
            String tempVal = numsArr[currIdx];
            numsArr[currIdx] = numsArr[nextIdx];
            numsArr[nextIdx] = tempVal;

            currIdx += 2;
            nextIdx += 2;
        }
    }
    
	private static List<String> reverseNums(List<String> resultsList, int currIdx, String[] inputsArr){
		// Base Case:
		if(currIdx == inputsArr.length){
			return resultsList;
		}
		
		resultsList = reverseNums(resultsList, currIdx + 1, inputsArr);
		resultsList.add(inputsArr[currIdx]);
		
		return resultsList;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        // Reverse an input array;
		if(n > 0){
			sc.nextLine();
			
			String inputLine = sc.nextLine();
		
			String[] inputsArr = inputLine.split(" ");
			List<String> resultsArr = new ArrayList<>();

			List<String> reverseArr = reverseNums(resultsArr, 0, inputsArr);

			System.out.println(String.join(" ", resultsArr));
		}

        // Swap adjacent elements in an array;
        int N = sc.nextInt();
		if(N > 0){
			sc.nextLine();
		
			String inputLine = sc.nextLine();

			String[] numsArr = inputLine.split(" ");

            swapAdjacentElements(numsArr, N);

			System.out.println(String.join(" ", numsArr));
		}

        sc.close();
	}
}

// Exercise3 - Solution;
class Student{
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = mark;
    }

    public int getTotalMarks() {
        int total = 0;

        for(int mark : marks){
            total += mark;
        }

        return total;
    }

    public double getAverageMarks(){
        int total = getTotalMarks();
        return (double) total / marks.length;
    }

    public int getMaximumMark() {
        int max = Integer.MIN_VALUE;

        for(int mark : marks){
            if(mark > max){
                max = mark;
            }
        }

        return max;
    }

    public int getMinimumMark() {
        int min = Integer.MAX_VALUE;

        for(int mark : marks){
            if(mark < min){
                min = mark;
            }
        }

        return min;
    }
}

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        System.out.println("Enter marks for " + n + " subjects:");
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.print("Enter the student name: ");
        sc.nextLine(); // Consume the newline character
        String studentName = sc.nextLine();

        Student student = new Student(studentName, marks);

        int totalMarks = student.getTotalMarks();
        int maxMark = student.getMaximumMark();
        int minMark = student.getMinimumMark();

        double averageMarks = student.getAverageMarks();

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Maximum Mark: " + maxMark);
        System.out.println("Minimum Mark: " + minMark);
        
        sc.close();
    }
}