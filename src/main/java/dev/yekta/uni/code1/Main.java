package dev.yekta.uni.code1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = s.nextInt();
        System.out.println("Enter another number: ");
        int number2 = s.nextInt();

        compareNums(number1, number2);

        //printOddNumbers(number);
        //printEvenNumbers(number);
        //System.out.println(sumOfNumbers(number1));
    }

    private static void compareNums(int n1, int n2) {
        if (n1 >  n2)
            System.out.println("The first number (" + n1 + ") is bigger than the second one (" + n2 + ").");
        else if (n1 < n2)
            System.out.println("The second number (" + n2 + ") is bigger than the first one (" + n1 + ").");
        else
            System.out.println("The given numbers are equal.");
    }

    private static int sumOfNumbers(int num) {
        int sum = 0;

        for (int i = 0; i < num; i++)
            sum += i;

        return sum;
    }

    private static void printEvenNumbers(int num) {
        System.out.println("Even numbers below " + num + " are: ");

        for (int i = 0; i < num; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }

    private static void printOddNumbers(int num) {
        System.out.println("Odd numbers below " + num + " are: ");

        for (int i = 0; i < num; i++)
            if (i % 2 == 1)
                System.out.println(i);
    }
}
