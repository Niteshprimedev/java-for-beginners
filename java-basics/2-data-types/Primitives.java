class PrimitiveTypes {
    public static void main(String[] args){
        // Byte -> 8 bits; -> -128 to 127;
        byte smallNumber = 100; 
        System.out.println("Small number: " + smallNumber);

        // Short -> 16 bits; -> -32768 to 32767;
        short mediumNumber = 20000;
        System.out.println("Medium number: " + mediumNumber);

        // Integer -> 32 bits;
        int myAge = 30;
        System.out.println("My age: " + myAge);

        // Long -> 64 bits;
        long largeNumber = 123456789L;
        System.out.println("Large number: " + largeNumber);

        // Float -> 32 bits;
        float pi = 3.14f;
        System.out.println("Pi value: " + pi);

        // Double -> 64 bits;
        double myHeight = 1.75;
        System.out.println("My height: " + myHeight);

        // Char -> single character; -> 16 bits;
        char myGrade = 'A';
        System.out.println("My grade: " + myGrade);

        // Boolean -> true or false; -> 1 bit;
        boolean isSunny = true;
        System.out.println("Is it sunny? " + isSunny);
    }
}
