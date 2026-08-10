import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {


        // 1. ARRAY DECLARATION


        int[] arr1;

        // Only declaration.
        // No array object has been created yet.



        // 2. DECLARATION + MEMORY ALLOCATION


        int[] arr2 = new int[5];

        // Creates an int array of size 5.
        //
        // Default values for int = 0
        //
        // [0] [0] [0] [0] [0]
        //  0   1   2   3   4
        // index



        // 3. DECLARATION + INITIALIZATION


        int[] arr3 = {10, 20, 30, 40, 50};

        // Java automatically determines the size.

        // Size = 5

        // [10] [20] [30] [40] [50]
        //   0    1    2    3    4


        // Another way:

        int[] arr4 = new int[]{10, 20, 30, 40, 50};



        // 4. DECLARATION FIRST, INITIALIZATION LATER


        int[] arr5;

        arr5 = new int[5];

        arr5[0] = 100;
        arr5[1] = 200;
        arr5[2] = 300;
        arr5[3] = 400;
        arr5[4] = 500;



        // 5. ACCESSING ARRAY ELEMENTS


        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fifth element: " + numbers[4]);



        // 6. UPDATING ARRAY ELEMENT


        numbers[2] = 100;

        // Before:
        // 10 20 30 40 50

        // After:
        // 10 20 100 40 50

        System.out.println("After updating: " +
                Arrays.toString(numbers));



        // 7. ARRAY LENGTH


        System.out.println("Array length: " + numbers.length);

        // IMPORTANT:

        // Correct:
        // numbers.length

        // Wrong:
        // numbers.length()

        // Arrays use .length, not .length()



        // 8. TRAVERSING USING NORMAL FOR LOOP


        System.out.println("\nNormal for loop:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(
                    "Index " + i + " = " + numbers[i]
            );
        }



        // 9. ENHANCED FOR LOOP


        System.out.println("\nEnhanced for loop:");

        for (int value : numbers) {

            System.out.println(value);
        }
        //one more example
        /*int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }*/
        //output
       /* 10
        20
        30
        40
        50*/
        /*
        // Normal for
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

/*Enhanced for
for (int num : numbers) {
    System.out.println(num);
}
         */




        // Here 'value' directly gets each element.

        // Use normal for loop when you need the INDEX.
        // Use enhanced for loop when you only need VALUES.



        // 10. ARRAYS.TOSTRING()


        System.out.println("\nUsing Arrays.toString():");

        System.out.println(Arrays.toString(numbers));

        // Output:
        // [10, 20, 100, 40, 50]

        // This is a convenient way to print a 1D array.

        // Without Arrays.toString():

        // System.out.println(numbers);

        // This DOES NOT print the elements properly.

        // Arrays.toString(numbers) is the shortcut.



        // 11. DIFFERENT DATA TYPES


        int[] ages = {18, 19, 20};

        double[] prices = {10.5, 20.5, 30.5};

        char[] letters = {'A', 'B', 'C'};

        boolean[] status = {true, false, true};

        String[] names = {"Ram", "Sam", "John"};

        System.out.println("\nDifferent data type arrays:");

        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(status));
        System.out.println(Arrays.toString(names));



        // 12. DEFAULT VALUES


        int[] intArray = new int[3];

        double[] doubleArray = new double[3];

        boolean[] booleanArray = new boolean[3];

        char[] charArray = new char[3];

        String[] stringArray = new String[3];

        System.out.println("\nDefault values:");

        System.out.println("int:     " +
                Arrays.toString(intArray));

        System.out.println("double:  " +
                Arrays.toString(doubleArray));

        System.out.println("boolean: " +
                Arrays.toString(booleanArray));

        System.out.println("char:    " +
                Arrays.toString(charArray));

        System.out.println("String:  " +
                Arrays.toString(stringArray));


        // Default values:
        //
        // int     -> 0
        // double  -> 0.0
        // boolean -> false
        // char    -> '\u0000'
        // Objects/String -> null



        // 13. TAKING ARRAY INPUT FROM USER


        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter array size: ");

        int n = sc.nextInt();

        int[] userArray = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < userArray.length; i++) {

            userArray[i] = sc.nextInt();
        }

        System.out.println("Your array:");

        System.out.println(Arrays.toString(userArray));



        // 14. ARRAY COPYING — IMPORTANT


        int[] original = {10, 20, 30};

        int[] reference = original;

        // reference = original

        // does NOT create a new array.

        // Both variables refer to the SAME array.


        reference[0] = 100;

        System.out.println("\nOriginal: " +
                Arrays.toString(original));

        System.out.println("Reference: " +
                Arrays.toString(reference));

        // Output:

        // Original:  [100, 20, 30]
        // Reference: [100, 20, 30]
        // Changing reference also changed original.


        // 15. ACTUAL ARRAY COPYING


        int[] source = {10, 20, 30};

        int[] copy = Arrays.copyOf(source, source.length);

        copy[0] = 999;

        System.out.println("\nSource: " +
                Arrays.toString(source));

        System.out.println("Copy: " +
                Arrays.toString(copy));

        // Output:

        // Source: [10, 20, 30]
        // Copy:   [999, 20, 30]
        // Now they are two different arrays.



        // 16. ARRAY INDEX OUT OF BOUNDS

        /*
        int[] test = {10, 20, 30, 40, 50};

        System.out.println(test[10]);

        */

        // The above code causes:
        // ArrayIndexOutOfBoundsException
        // Why?
        // Array size = 5
        // Valid indexes = 0, 1, 2, 3, 4
        // test[10] does not exist.



        // 17. MULTI-DIMENSIONAL ARRAY — INTRODUCTION


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // This is NOT a 1D array.
        // It is a 2D array.

        // Think of it as rows and columns:

        // 1 2 3
        // 4 5 6

        System.out.println("\n2D Array:");

        System.out.println(matrix[0][0]);  // 1
        System.out.println(matrix[1][2]);  // 6



        // 18. ARRAY IS AN OBJECT

        int[] example = {10, 20, 30};

        // Arrays in Java are objects.
        //
        // Therefore:
        //
        // int[] example
        //
        // is a reference variable that refers to
        // an array object in memory.


        sc.close();
    }
}