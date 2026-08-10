import java.util.Scanner;
public class array1dprograms {
    public static void main(String[] args) {
/*1. Declare and Print an Array
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/



        /*2. Take Array Elements from User and Print Them

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
 } }
         */

        /*
      3. Find Sum of All Elements

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}

         */

/*
 4. Find Average of Elements

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}


 */

        /*
5. Find Maximum Element


        int[] arr = {25, 10, 45, 30, 15};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}

         */
        /*
6. Find Minimum Element


        int[] arr = {25, 10, 45, 30, 15};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
}

         */

        /*


        7. Search for an Element


        int[] arr = {10, 20, 30, 40, 50};

        int target = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
         */


        /*
        8. Count Even and Odd Elements

        int[] arr = {10, 15, 22, 33, 40, 51};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);
    }
}
         */
        /*
        9. Reverse an Array

        int[] arr = {10, 20, 30, 40, 50};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
         */
/*
10. Copy One Array into Another

        int[] arr1 = {10, 20, 30, 40, 50};

        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

 */
/*
11. Find Second Largest Element


        int[] arr = {10, 40, 20, 50, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}
 */

        /*
        12. Find Second Smallest Element


        int[] arr = {10, 40, 20, 50, 30};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest = " + secondSmallest);
    }
}
         */
        /*
        13. Count Frequency of an Element


        int[] arr = {10, 20, 10, 30, 10, 40};

        int target = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println(target + " occurs " + count + " times");
    }
}
         */
        /*
       14. Check Whether Array is Sorted
        int[] arr = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

         */
        /*
        15. Remove Duplicates


        int[] arr = {10, 20, 10, 30, 20, 40};

        System.out.println("Array without duplicates:");

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

         */

        /*
        16. Insert an Element at a Position

Here, position = 2 means inserting at index 2.



        int[] arr = {10, 20, 30, 40, 50};

        int position = 2;
        int element = 99;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = element;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

         */
        /*
17. Delete an Element from a Position


        int[] arr = {10, 20, 30, 40, 50};

        int position = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


         */
        /*
        18. Rotate Array Left

Example:

Original: 10 20 30 40 50
Left:     20 30 40 50 10


        int[] arr = {10, 20, 30, 40, 50};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.println("Left rotated array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

         */
        /*
19. Rotate Array Right

Example:

Original: 10 20 30 40 50
Right:    50 10 20 30 40


        int[] arr = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Right rotated array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


         */
        /*
20. Merge Two Arrays


        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }


         */
    }
}
