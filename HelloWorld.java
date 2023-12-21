class HelloWorld {
    public static void main(String[] args) {
    // interger types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 214783647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.797679313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u0049';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);

        char percentSymbol = '%';

        System.out.println("This is the copyright symbol: " + percentSymbol);

        //int number1 = 5;
        //double number2 = number1;

        //System.out.println(number2);

        double number3 = 5.8;
        int number4 = (int)number3;

        System.out.println(number4);

        int number1 = 12;
        int number2 = 6;

        // addition
        System.out.println(number1 + number2); // 18

        // subtraction
        System.out.println(number1 - number2); // 6
          System.out.println(number2 - number1); // 6

        // multiplication
        System.out.println(number1 * number2); // 72

        // division
        System.out.println(number1 / number2); // 2

        // remainder (modulo/modulus)
        System.out.println(number1 % number2); // 0

        //int number = 12;

        //number = number + 5;
        //number += 5;
        //number -= 6;
        //number %= 2;
        //number *= 9;

       // System.out.println(number);
       // System.out.println(number5);

       // is equal to 
        System.out.println(number1 == number2);

        // is not equal to 
         System.out.println(number1 != number2);

        // is greater than
        System.out.println(number1 > number2);

        // is less than
        System.out.println(number1 < number2);

        // is greater than or equal to
        System.out.println(number1 >= number2);

        // is less than or equal to
        System.out.println(number1 <= number2);

        // logicall operators

        int age = 45;

        System.out.println(age >= 18 && age <= 40);

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(isStudent ||  isLibraryMember);

        // prints false
        System.out.println(isStudent);

        // prints true 
        System.out.println(!isStudent);

        int score = 0;
        int turns = 10;

        score++;
        turns--;

        System.out.println(score);
        System.out.println(turns);

        int number = 55;

        // complier reads left to right so you wont see the increment until after increment
        System.out.println(number++);
        System.out.println(number);

        // will increment in compiler right away because it sees the increment first, reading left to right
        System.out.println(++number);

         // you can aslo increment this way as well
        number ++;

        char percentSign = '%';

        System.out.println(percentSign);

        // other ways of declaring a string

        String name = "Farhan Hasin Chowdhury";

        String name = new String("Farhan Hasin Chowdhury");

        System.out.println(name);




    }
}
