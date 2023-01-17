package uf1practicas;

import java.util.Scanner;

public class Pract08 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        sc.useDelimiter("\n");
        int option;
        do {
            System.out.println("\n\n");
            System.out.println("--MENU SELECTOR--");
            System.out.println("-----------------");
            System.out.println("[1]- Exercise 01");
            System.out.println("[2]- Exercise 02");
            System.out.println("[3]- Exercise 03");
            System.out.println("[4]- Exercise 04");
            System.out.println("[5]- Exercise 05");
            System.out.println("[6]- Exercise 06");
            System.out.println("[7]- Exercise 07");
            System.out.println("[0]- Exit \n");

            System.out.print("Select an exercise: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    Ex1();
                    break;
                case 2:
                    Ex2();
                    break;
                case 3:
                    Ex3();
                    break;
                case 4:
                    Ex4();
                    break;
                case 5:
                    Ex5();
                    break;
                case 6:
                    Ex6();
                    break;
                case 7:
                    Ex7();
                    break;
                case 0:
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);

    }

    static void Ex1() {
        int integer;
        System.out.println("\n");
        System.out.println("---------- EXERCISE 01 ----------\n");
        System.out.println("Select a boolean:");
        System.out.println("-----------------");
        System.out.println("[1] Boolean 'For'");
        System.out.println("[2] Boolean 'While'");
        System.out.println("[3] Boolean 'Do-While'");
        int subEx01 = sc.nextInt();
        switch (subEx01) {

            case 1:

                System.out.print("Insert an integer: ");
                integer = sc.nextInt();

                for (int i = 0; i <= 100; i++) {
                    if (i % integer == 0) {
                        System.out.println(" " + i);
                    }
                }
                break;
            case 2:
                System.out.print("Insert an integer: ");
                integer = sc.nextInt();
                int j = 0;
                while (j <= 100) {
                    j++;
                    if (j % integer == 0) {
                        System.out.println(" " + j);
                    }
                }
                break;
            case 3:
                System.out.print("Insert an integer: ");
                integer = sc.nextInt();
                int k = 0;
                do {
                    k++;
                    if (k % integer == 0) {
                        System.out.println(" " + k);
                    }
                } while (k <= 100);

                break;
            default:
                throw new AssertionError();
        }

    }

    static void Ex2() {
        int integer;
        System.out.println("\n");
        System.out.println("---------- EXERCISE 02 ----------\n");
        System.out.println("Select a boolean:");
        System.out.println("-----------------");
        System.out.println("[1] Boolean 'For'");
        System.out.println("[2] Boolean 'While'");
        System.out.println("[3] Boolean 'Do-While'");
        int subEx02 = sc.nextInt();
        switch (subEx02) {

            case 1:
                System.out.print("Insert an integer > 10: ");
                integer = sc.nextInt();
                System.out.println("Let's count numbers by 10's between " + integer + " and 0");

                for (int i = integer; i > 0; i -= 10) {
                    System.out.println(" " + i);
                }
                break;

            case 2:
                System.out.print("Insert an integer > 10: ");
                integer = sc.nextInt();
                System.out.println("Let's count numbers by 10's between " + integer + " and 0");
                int j = integer;
                while (j > 0) {
                    j -= 10;
                    if (j >= 0) {
                        System.out.println(" " + j);
                    }
                }
                break;

            case 3:
                System.out.print("Insert an integer > 10: ");
                integer = sc.nextInt();
                System.out.println("Let's count numbers by 10's between " + integer + " and 0");
                int k = integer;
                do {
                    k -= 10;
                    if (k >= 0) {
                        System.out.println(" " + k);
                    }
                } while (k >= 0);
                break;
            default:
                throw new AssertionError();
        }
    }

    static void Ex3() {
        int integer;
        System.out.println("\n");
        System.out.println("---------- EXERCISE 03 ----------\n");
        System.out.print("Input a number to multiply:");
        integer = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(integer + " x " + i + " = " + (integer * i));
        }
    }

    static void Ex4() {
        System.out.println("\n");
        System.out.println("---------- EXERCISE 04 ----------\n");
        System.out.print("Insert a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 5; i++) {
            number++;
            // pow es la funciÛn est·tica de la clase Math, al indicar despuÈs de la coma el n˙mero que queremos estamos elevando el valor del " int number " multiplic·ndolo x veces indicadas
            System.out.printf("\033[33m%-1s \033[36m%-1s \033[37m%-7s \033[33m%-1s \033[36m%-1s \033[37m%-1s", number, " squared:", Math.pow(number, 2), number, " cubed:", Math.pow(number, 3) + "\n");
        }
    }

    static void Ex5() {
        System.out.println("\n");
        System.out.println("---------- EXERCISE 05 ----------\n");
        System.out.print("Insert a number to calculate digits: ");
        int number = sc.nextInt();
        int number2 = number;
        int num = 0;
        while (number != 0) {
            number = number / 10;
            num++;
        }
        System.out.println("The number " + number2 + " has " + num + " digits");
    }

    static void Ex6() {
        System.out.println("\n");
        System.out.println("---------- EXERCISE 06 ----------\n");
        System.out.print("Guess the number that machine has selected: ");

        int random;
        int min = 0;
        int max = 10;
        boolean win = false;
        int count = 3;
        random = (int) (Math.random() * (max - min) + min);
        do {

            int tries = sc.nextInt();
            count--;

            if (tries > random) {

                System.out.println("LOWER, you have left " + count);
            }
            if (tries < random) {

                System.out.println("HIGHER, you have left " + count);
            }
            if (tries == random) {
                win = true;
                System.out.println("You win!");
            }
        } while (!win && (count > 0));

        if (!win) {
            System.out.println("You lose...");
        }
    }

    static void Ex7() {
        System.out.println("\n");
        System.out.println("---------- EXERCISE 07 ----------\n");
        System.out.print("Insert the base: ");
        int base = sc.nextInt();
        System.out.print("Insert the exponent: ");
        int exponent = sc.nextInt();
        int power = 1;

        if (exponent == 0) {
            power = 1;
        }
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                power *= base;
            }
        }
        if (exponent < 0) {
            for (int i = 0; i < -exponent; i++) {
                power *= base;
            }
            power = 1 / power;
        }
        System.out.println(base + " power of " + exponent + " = " + power);
    }
}

