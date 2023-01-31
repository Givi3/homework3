import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner keyboard = new Scanner(System.in);
        Object locale = null;

        System.out.println(" Write your name >");
        String name = keyboard.next();
        System.out.println ("Hi, + name +");

        System.out.println("Write Argument  1 >");
        double arg1 = keyboard.nextDouble();

        System.out.println("Write Argument 2 >");
        double arg2 = keyboard.nextDouble();

        double result = arg1 + arg2;
        System.out.println(arg1 + " + " + arg2 + " = " + result);
        System.out.println(arg1 + " - " + arg2 + " = " + result);
        System.out.println(arg1 + " * " + arg2 +" = " + result);

    }
}
