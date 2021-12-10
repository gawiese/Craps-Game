////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// October 25th, 2021

// Homework 6, Programming Exercise 6.30 on page 243, Craps game

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
class Main {
    public static void main(String[] args) {

        Random dieSpinner = new Random();

        int max = 7;

        int min = 1;

        int dieOne;

        int dieTwo;

        int sum;

        int point;

        while (true) {

            dieOne = dieSpinner.nextInt(max - min) + min;

            dieTwo = dieSpinner.nextInt(max - min) + min;

            sum = (dieOne + dieTwo);

            System.out.print("You rolled a " + dieOne + " + " + dieTwo + " = " + sum + "\n");

            point = sum;

            if (sum == 2 || sum == 3 || sum == 12) {

                System.out.println("Craps!");

                System.out.println("You lose");

                break;
            }

            if (sum == 7 || sum == 11) {

                System.out.println("Natural!");

                System.out.println("You win");

                break;
            }

            if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {

                System.out.println("point is " + point);

                break;
            }
        }

        while (true) {

            int dieThree = dieSpinner.nextInt(max - min) + min;

            int dieFour = dieSpinner.nextInt(max - min) + min;

            int sumTwo = (dieThree + dieFour);

            if (sum == 2 || sum == 3 || sum == 12) {

                break; }

            if (sum == 7 || sum == 11) {

                break; }

            if (sumTwo == point) {

                System.out.print("You rolled a " + dieThree + " + " + dieFour + " = " + sumTwo + "\n");

                System.out.println("You win!");

                break; }

            if (sumTwo == 7) {

                System.out.print("You rolled a " + dieThree + " + " + dieFour + " = " + sumTwo + "\n");

                System.out.println("You lose!");

                break; }
            System.out.print("You rolled a " + dieThree + " + " + dieFour + " = " + sumTwo + "\n");
        }
    }
}
