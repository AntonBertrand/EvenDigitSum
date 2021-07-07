package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum (int number){

        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {

            int currentDigit = number % 10;

            if ((currentDigit % 2) == 0) {
                sum += currentDigit;
            }

            number = number /10;



        }

        return sum;
    }
}
