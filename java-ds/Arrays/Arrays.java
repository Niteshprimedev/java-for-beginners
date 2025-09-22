public class ArrayExamples {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry", "strawberry", "kiwifruit"};

        // Lenght;
        int arrLen = strArray.length;  // 5
        System.out.println("Length: " + arrLen);

        // Accessing elements
        String firstElem = strArray[0];  // apple

        String lastElem = strArray[arrLen - 1];  // kiwifruit
        System.out.println("First: " + firstElem + ", Last: " + lastElem);

        // Slicing (using Arrays.copyOfRange)
        String[] subArray = java.util.Arrays.copyOfRange(strArray, 1, 4);  // ["banana", "cherry", "strawberry"]
        System.out.println("Sub-array: " + java.util.Arrays.toString(subArray));

        // Fill elements (need Arrays.fill)
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 24);  // [24, 24, 24, 24, 24]
        System.out.println("Filled array: " + java.util.Arrays.toString(filledArray));

        // sorting (need Arrays.sort)
        int[] numArray = {5, 2, 8, 1, 3};
        java.util.Arrays.sort(numArray);  // [1, 2, 3, 5, 8]
        System.out.println("Sorted: " + java.util.Arrays.toString(numArray));

        // reverse sorting (need Integer[] + Arrays.sort with Comparator)
        Integer[] numArrayRev = {5, 2, 8, 1, 3};
        java.util.Arrays.sort(numArrayRev, java.util.Collections.reverseOrder());  // [8, 5, 3, 2, 1]
        System.out.println("Reverse sorted: " + java.util.Arrays.toString(numArrayRev));

        // Compare two arrays (need Arrays.equals)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean areEqual = java.util.Arrays.equals(arr1, arr2);  // true
        System.out.println("Are equal: " + areEqual);

        // Looping through array
        for(Integer elem : numArrayRev){
            System.out.print(elem + " ");
        }
        System.out.println();

        // Mismatching array elements (need Arrays.mismatch)
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1, 2, 0, 4};
        int mismatchIndex = java.util.Arrays.mismatch(arr3, arr4);  // 2 (index of first mismatch)
        System.out.println("Mismatch index: " + mismatchIndex);

        // Copying array (need Arrays.copyOf)
        int[] arrCopy = java.util.Arrays.copyOf(arr3, arr3.length);  // [1, 2, 3, 4]
        System.out.println("Array copy: " + java.util.Arrays.toString(arrCopy));    

        // Joining array elements (need String.join)
        String joinedStr = String.join(", ", strArray);  // "apple, banana, cherry, strawberry, kiwifruit"
        System.out.println("Joined string: " + joinedStr);  

        // Converting array to list (need Arrays.asList)
        java.util.List<String> strList = java.util.Arrays.asList(strArray);  // [apple, banana, cherry, strawberry, kiwifruit]
        System.out.println("Array to list: " + strList);


        // Converting list to array (need List.toArray)
        String[] listToArray = strList.toArray(new String[0]);  // ["apple", "banana", "cherry", "strawberry", "kiwifruit"]
        System.out.println("List to array: " + java.util.Arrays.toString(listToArray));

        // Multi-dimensional array
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in multi-dimensional array
        int elem23 = multiArray[1][2];  // 6        
        System.out.println("Element at (2,3): " + elem23);  // 6
    }
}