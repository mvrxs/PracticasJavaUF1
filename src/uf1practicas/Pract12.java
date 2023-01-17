package uf1practicas;

import java.util.Scanner;

public class Pract12 {

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
                case 1 -> Ex1();
                case 2 -> Ex2();
                case 3 -> Ex3();
//                case 4:
//                    Ex4();
//                    break;
//                case 5:
//                    Ex5();
//                    break;
//                case 6:
//                    Ex6();
//                    break;
//                case 7:
//                    Ex7();
//                    break;
//                case 8:
//                    Ex8();
//                    break;
//                case 9:
//                    Ex9();
//                    break;
//                case 10:
//                    Ex10();
//                    break;
                case 0 -> {
                    System.out.println("Good Bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        } while (true);
    }

    static void Ex1() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 01 ----------\n");
        System.out.println();

        int SIZE = 10;
        int[] listNum = new int[SIZE];

        System.out.println("Insert 10 whole numbers to print reversed:");

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = sc.nextInt();
        }

        System.out.println("The reversed numbers are:");

        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.println(listNum[i]);
        }
    }

    static void Ex2() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 02 ----------\n");
        System.out.println();
        System.out.println("NUMBER   SQUARED   CUBED");
        System.out.println("------   -------   -----");
        int NUMBER = 20;
        int SQUARED = 20;
        int CUBED = 20;

        int[] listNum = new int[NUMBER];

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = (int) (Math.random() * 100 + 0);
        }

        int[] listSqu = new int[SQUARED];

        for (int i = 0; i < listSqu.length; i++) {
            listSqu[i] = (int) Math.pow(listNum[i], 2);
        }

        int[] listCub = new int[CUBED];

        for (int i = 0; i < listCub.length; i++) {
            listCub[i] = (int) Math.pow(listNum[i], 3);

            System.out.printf("%-8s %-9s %1s\n", listNum[i], listSqu[i], listCub[i]);
        }
    }

    static void Ex3() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 02 ----------\n");
        System.out.println();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int NUMBERS = 10;
        int[] listNum = new int[NUMBERS];


        System.out.println("Insert 10 numbers: ");

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = sc.nextInt();
            if (listNum[i] > max) {
                max = listNum[i];
            }
            if (listNum[i] < min) {
                min = listNum[i];
            }
        }

        System.out.println("Los numeros son: ");

        for (int i = 0; i < listNum.length; i++) {
            //System.out.println(listNum[i]);

            if (listNum[i] == max) {
                System.out.println(max + " max");
            } else if (listNum[i] == min) {
                System.out.println(min + " min");
            }
            else System.out.println(listNum[i]);
        }
    }
}

