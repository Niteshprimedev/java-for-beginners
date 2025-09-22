class JavaStrings{
    private static void creatingStrings(){
        // Using literals;
        String myName = "Nitesh";
        // Output: Nitesh 

        // Using new Keyword;
        String myCompany = new String("Google");
        // Output: Google 

        // Using String Builder;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nitesh");
        stringBuilder.append("works at ");
        stringBuilder.append("Google! 😀 ");
        String strSentence = stringBuilder.toString();
        // Output: Nitesh works at Google! 😀 
    }

    private static void stringMethods(){
        // 01 String concat method to add two strings;
        String str1 = "Hello";
        String str2 = " World!";
        
        String result = str1.concat(str2);
        System.out.println(result); // Output: Hello World!
        
        // 02 String length method to get string length;
        int strLen = result.length();
        System.out.println(strLen);
        // Output: 12 => Hello World!

        // 03 String equals method to check equality;
        String str1 = "Hello";
        String str2 = " World!";
        String str3 = "Hello";
        String str4 = "hello";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equalsIgnoreCase(str4)); // true
    }

    public static void main(String[] args){
        System.out.println("Strings in Java");
        // Output: Strings in Java

        // Creating Strings in java;
        creatingStrings();

        // String Methods in java;
        stringMethods();
    }
}