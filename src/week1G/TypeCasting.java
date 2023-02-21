package week1G;

public class TypeCasting {

    public static void main(String[] args) {

        /**
         1) Auto Widening Casting: If you assign a smaller data type to a larger data type then java converts the data type automatically to the larger one.
         */

        short cast = 89;

        byte small = 87;

        short byteCasting = small;

        int castType = small;


        /**
         2) Explicit Narrowing Casting: If you assign a larger data type to a smaller data type the java can't convert the data type automatically to the smaller one.
         ** You have to convert it manually
         */


        int biggerValue = 75;

        short smallerValue = (short) biggerValue;

        double biggest = 732189732;

        int number = (int) biggest;

        System.out.println("Number is: " + number);

        System.out.println("Smaller value: " + biggerValue);

    }
}
