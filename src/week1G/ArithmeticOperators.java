package week1G;

public class ArithmeticOperators {

    public static void main (String[] args) {

        int a, b;
        a = 20;
        b = 10;

        int c, d, e, f;
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;

        System.out.println("Sum of a and b: " + c);
        System.out.println("Subtraction of a and b: " + d);
        System.out.println("Multiplication of a and b: " + e);
        System.out.println("Division of a and b: " + f);

        int x = 35 / 2 - (4+3) * 2;

        System.out.println("Result of x is: " + x);

        // % -> Modulus / Remainder

        int num1 = 45; //45-39 = 6
        int num2 = 13; //13+13+13 = 39

        int remainder = num1 % num2;

        System.out.println("Remainder is: " + remainder);

        int ab = 32165312;
        int bb = 10;

        int cc = ab % bb;

        System.out.println("Remainder is: " + cc);
    }
}
