import java.util.Scanner;
import java.util.Arrays;

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

        System.out.println("This is the percent symbol: " + percentSymbol);

        //int number1 = 5;
        //double number2 = number1;

        //System.out.println(number2);

        // double number3 = 5.8;
        // int number4 = (int)number3;

        // System.out.println(number4);

        // int number1 = 12;
        // int number2 = 6;

        // addition
        //System.out.println(number1 + number2); // 18

        // subtraction
        //System.out.println(number1 - number2); // 6
         // System.out.println(number2 - number1); // 6

        // multiplication
       // System.out.println(number1 * number2); // 72

        // division
        //System.out.println(number1 / number2); // 2

        // remainder (modulo/modulus)
        //System.out.println(number1 % number2); // 0

        //int number = 12;

        //number = number + 5;
        //number += 5;
        //number -= 6;
        //number %= 2;
        //number *= 9;

       // System.out.println(number);
       // System.out.println(number5);

       // is equal to 
        //System.out.println(number1 == number2);

        // is not equal to 
        // System.out.println(number1 != number2);

        // is greater than
       // System.out.println(number1 > number2);

        // is less than
        //System.out.println(number1 < number2);

        // is greater than or equal to
        //System.out.println(number1 >= number2);

        // is less than or equal to
        //System.out.println(number1 <= number2);

        // logicall operators

        //int age = 45;

        //System.out.println(age >= 18 && age <= 40);

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

        // char percentSign = '%';

        // System.out.println(percentSign);

        // other ways of declaring a string

        // String name = "Farhan Hasin Chowdhury";

        // String name = new String("Farhan Hasin Chowdhury");

        // System.out.println(name);

        // String literalString1 = "abc";
        // String literalString2 = "abc";

        // String objectString1 = new String("xyz");
        // String objectString2 = new String("xyz");

        // System.out.println(literalString1 == literalString2);

        // System.out.println(objectString1 == objectString2);

        // String name = "Farhan Hasin Chowdhuru"; // for string it is - %s
        // String country = "Bangladesh"; 
        // int age = 26; // for in interger it is -%d
        // String company = "freeCodeCamp";
        // double gpa = 3.8; // for doubles and floats - %f
        // char percentSign = '%'; // for characters - %c
        // boolean amITellingTheTruth = false; // for boolenas - %b

        // // this becomes to complicated
        // //System.out.println("Hello World! I am " + name + ". I am from " + country + " and I am " + age + "years old. I work for " + company + ".");

        // // we use formattedstring instead for lesss complexity

        // String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", name, country, age, company, gpa, percentSign, amITellingTheTruth);

        // System.out.println(formattedString);

        //String name = "Dane Knight";

       // System.out.println(name.length());

        //System.out.println(name.isEmpty());

        //System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());

        // they wil not be the same object although they have the same string
        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1 == string2);
        // they will be the same because they have the same value
        System.out.println(string1.equals(string2));
        // checking the value regarless of the case of the string
        System.out.println(string1.equalsIgnoreCase(string2));


        String string = "The sky is blue";

        // this change is not permanent for the string
        // System.out.println(string.replace("blue", "red"));
        // System.out.println(string);

        // this will change value of the string
        // String updatedString = string.replace("blue", "red");

        // System.out.println(updatedString);

        System.out.println(string.contains("freeCodeCamp"));

        // Scanner scanner = new Scanner(System.in); // you must import java.util.scanner to use this object scanner & the System.in

        // System.out.print("What is your name? ");
        // String name = scanner.nextLine();
        
        // System.out.printf("Hello %s. How old are you?", name);
        // int age = scanner.nextInt();

        //double gpa = Double.parseDouble(scanner.nextLine());

        // instead of using nextInt we can use which will not cause a skip in the next line
        // in age = Integer.parseInt(scanner.nextLine());

        // cleans up the input buffer when you have a nextInt because it will skip the next line 
        // scanner.nextLine();



        // System.out.printf("%d is excellent age to start programming? What language do you prefer? " , age);
        // String language = scanner.nextLine();

        // System.out.printf("%s is a verfy popular programming language.", language)

        // if (operation.equals("sum")) {
        //   System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        // } else if (operation.equals("sub")) {
        //   System.out.printf("%f + %f = %f", number1, number2, number1 - number2);
        // } else if (operation.equals("mul")) {
        //   System.out.printf("%f + %f = %f", number1, number2, number1 * number2);
        // } else if (operation.equals("div")) {
        //   if (number2 == 0) {
        //     System.out.println("Can not divide by zero. ");
        //   } else {
        //   System.out.printf("%f + %f = %f", number1, number2, number1 / number2);
        // } 
        // } else {
        //   System.out.printf("%s is not a supported operation.", operation);
        // }

        // switch case is better and faster than if conditional statements
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first number: ");
        // double number1 = scanner.nextDouble();
        // scanner.nextLine();

        // System.out.print("Enter the second number: ");
        // double number2 = scanner.nextDouble();
        // scanner.nextLine();

        // System.out.println("What operation do you want to perform? ");
        // String operation = scanner.nextLine();

        // switch (operation) {
        //   case "sum":
        //     System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        //     break;
        //   case "sub":
        //     System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        //     break;
        //   case "mul":
        //     System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        //     break;
        //   case "div":
        //     System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        //     if (number2 == 0) {
        //     System.out.println("Can not divide by zero");
        //     } else {
        //       System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        //     }
        //     break;
        //   default:
        //     System.out.printf("%s is not a supported operation", operation);

        // }

        // scanner.close();
        

        // Arrays
        //char vowels[] = new char[5];
       //a e i o u
        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        // define array in a single row

        //char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        
        // sort by index
        // int startingIndex = 1;
        // int endingIndex = 4;

        //Arrays.sort(vowels, startingIndex, endingIndex);

        // binary search method works with an sorted list
        

        // Arrays.sort(vowels);

        // int startingIndex = 1;
        // int endingIndex = 4;

        // char key = 'o';

        // // int foundItemIndex = Arrays.binarySearch(vowels, key);

        // int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);


        // System.out.println(Arrays.toString(vowels));
        // System.out.println(foundItemIndex);
        
      
        //System.out.println(vowels.length);

        // sort an array with Arrays.sort(vowels);

        // char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // using indexing to fill with x from index 1 to index 3
        // int startingIndex = 1;
        // int endingIndex = 4;

        //Arrays.fill(vowels, 'x');  to fill an array with x
        // Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        // System.out.println(Arrays.toString(vowels));
        int numbers[] = {1, 2, 3, 4, 5};

        int copyOfNumbers[] = numbers;
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));



    }


}
