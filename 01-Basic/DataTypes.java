class DataTypes {
    public static void main(String[] args) {

        // 1. byte
        byte age = 20;
        System.out.println("byte: " + age);


        // 2. short
        short marks = 300;
        System.out.println("short: " + marks);


        // 3. int
        int population = 1000000;
        System.out.println("int: " + population);


        // 4. long
        long distance = 10000000000L;
        System.out.println("long: " + distance);


        // 5. float
        float price = 99.5f;
        System.out.println("float: " + price);


        // 6. double
        double pi = 3.14159265359;
        System.out.println("double: " + pi);


        // 7. char
        char grade = 'A';
        System.out.println("char: " + grade);


        // 8. boolean
        boolean isPassed = true;
        System.out.println("boolean: " + isPassed);


        // 9. String
        String name = "Ashwani";
        System.out.println("String: " + name);


        // 10. Widening Type Casting
        int number = 100;
        long largeNumber = number;

        System.out.println("Widening: " + largeNumber);


        // 11. Narrowing Type Casting
        double decimal = 10.99;
        int integer = (int) decimal;

        System.out.println("Narrowing: " + integer);


        // 12. Integer to Double
        int value1 = 10;
        double value2 = value1;

        System.out.println("Integer to Double: " + value2);


        // 13. Double to Integer
        double value3 = 10.99;
        int value4 = (int) value3;

        System.out.println("Double to Integer: " + value4);


        // 14. Character to Integer
        char ch1 = 'A';
        int asciiValue = ch1;

        System.out.println("Character to Integer: " + asciiValue);


        // 15. Integer to Character
        int value5 = 65;
        char ch2 = (char) value5;

        System.out.println("Integer to Character: " + ch2);
    }
}