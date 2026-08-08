public class methodstype4 {

    static int greet(int a, int b) {

        int sum = a + b;
        System.out.println("sum is:"+sum);
        return sum;

    }

    public static void main(String[] args) {

       //greet(5, 6);                       //  Correct but return value ignored cuz need to store that value here

       //System.out.println(greet(5, 6));   //  Correct

        int result = greet(5, 6);          //  Correct but wrong without sout

       System.out.println(result);        //  Correct

    }
    // completed return type with parameter
}
