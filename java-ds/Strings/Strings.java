public class StringExamples {
    public static void main(String[] args) {
        String str1 = "my name is nitesh";

        // length
        int strLen = str1.length();  // 16
        System.out.println("Length: " + strLen);

        // copy
        String strCopy = str1;  // Strings are immutable, assignment creates a copy reference
        System.out.println("Copy: " + strCopy);  // my name is nitesh

        // first and last char
        char firstChar = str1.charAt(0);  // m
        char lastChar = str1.charAt(str1.length() - 1);  // h
        System.out.println("First: " + firstChar + ", Last: " + lastChar);

        // convert to string 
        String ageStr = String.valueOf(30); // "30"
        System.out.println("Age as string: " + ageStr);

        // slicing (using substring)
        String str1Modified = str1.substring(0, 2) + "full name is " + str1.substring(12);
        System.out.println("Modified: " + str1Modified);  // my full name is nitesh

        // building new string (replace spaces with underscores)
        StringBuilder newStr = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (c != ' ') {
                newStr.append(c);
            } else {
                newStr.append("_");
            }
        }
        System.out.println("New string: " + newStr.toString());  // my_name_is_nitesh

        // looping through string & ASCII difference
        for (char c : str1.toCharArray()) {
            if (c != ' ') {
                System.out.print(c + " " + (c - 'a') + " ");
            } else {
                System.out.print("  "); // for spaces
            }
        }
        System.out.println();
        // Output: m 12 y 24   n 13 a 0 m 12 e 4   i 8 s 18   n 13 i 8 t 19 e 4 s 18 h 7

        // sorting characters (need char[] + Arrays.sort)
        char[] sortedArr = str1.toCharArray();
        java.util.Arrays.sort(sortedArr);
        System.out.println("Sorted: " + java.util.Arrays.toString(sortedArr));
        // [' ', ' ', ' ', ' ', 'a', 'e', 'h', 'i', 'm', 'm', 'n', 'n', 's', 't', 'y']

        // reverse sort
        Character[] sortedArrRev = str1.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        java.util.Arrays.sort(sortedArrRev, java.util.Collections.reverseOrder());
        System.out.println("Reverse sorted: " + java.util.Arrays.toString(sortedArrRev));
        // ['y', 't', 's', 'n', 'n', 'm', 'm', 'i', 'h', 'e', 'a', ' ', ' ', ' ', ' ', ' ']

        // reverse string
        String reverseStr = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed: " + reverseStr);  // hsetin si eman ym

        // split
        String[] strList = str1.split(" ");
        System.out.println("Split: " + java.util.Arrays.toString(strList));
        // ['my', 'name', 'is', 'nitesh']

        // string methods
        String str2 = "Nitesh";
        String str2Lower = str2.toLowerCase();  // nitesh
        String str2Upper = str2.toUpperCase();  // NITESH
        String str2Title = str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase(); // Nitesh
        String str2Capitalize = str2.substring(0,1).toUpperCase() + str2.substring(1); // Nitesh
        String str2Swapcase = swapCase(str2);  // nITESH
        int str2Find = str2.indexOf("t");  // 2
        String str2Replace = str2.replace("N", "M");  // Mitesh
        String[] str2Split = str2.split("i");  // ['N', 'tesh']
        String str2Join = String.join(" ", str2Split);  // N tesh
        String str2Strip = stripChar(str2, 'N');  // itesh
        boolean str2StartsWith = str2.startsWith("N");  // true
        boolean str2EndsWith = str2.endsWith("h");  // true
        boolean str2IsAlpha = str2.matches("[a-zA-Z]+");  // true
        boolean str2IsDigit = str2.matches("\\d+");  // false
        boolean str2IsSpace = str2.trim().isEmpty();  // false
        int str2Count = str2.length() - str2.replace("i", "").length();  // 1

        System.out.println("Lower: " + str2Lower);
        System.out.println("Upper: " + str2Upper);
        System.out.println("Title: " + str2Title);
        System.out.println("Capitalize: " + str2Capitalize);
        System.out.println("Swapcase: " + str2Swapcase);
        System.out.println("Find 't': " + str2Find);
        System.out.println("Replace: " + str2Replace);
        System.out.println("Split: " + java.util.Arrays.toString(str2Split));
        System.out.println("Join: " + str2Join);
        System.out.println("Strip: " + str2Strip);
        System.out.println("StartsWith: " + str2StartsWith);
        System.out.println("EndsWith: " + str2EndsWith);
        System.out.println("IsAlpha: " + str2IsAlpha);
        System.out.println("IsDigit: " + str2IsDigit);
        System.out.println("IsSpace: " + str2IsSpace);
        System.out.println("Count of 'i': " + str2Count);

        // String formatting
        String name = "Nitesh";
        int age = 30;
        String formattedStr = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedStr);  // My name is Nitesh and I am 30 years old.
    }

    // helper function for swapcase
    public static String swapCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // helper function to strip a given char from start and end
    public static String stripChar(String input, char ch) {
        int start = 0;
        int end = input.length();

        while (start < end && input.charAt(start) == ch) {
            start++;
        }
        while (end > start && input.charAt(end - 1) == ch) {
            end--;
        }
        return input.substring(start, end);
    }
}