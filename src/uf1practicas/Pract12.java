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
            System.out.println("[7]- Exercise 08");
            System.out.println("[7]- Exercise 09");
            System.out.println("[7]- Exercise 10");
            System.out.println("[0]- Exit \n");

            System.out.print("Select an exercise: ");

            option = sc.nextInt();

            switch (option) {
                case 1 -> Ex1();
                case 2 -> Ex2();
                case 3 -> Ex3();
                case 4 -> Ex4();
                case 5 -> Ex5();
                case 6 -> Ex6();
                case 7 -> Ex7();
                case 8 -> Ex8();
                case 9 -> Ex9();
                case 10 -> Ex10();
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
            } else System.out.println(listNum[i]);
        }
    }

    static void Ex4() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 04 ----------\n");
        System.out.println();

        int NUMBERS = 15;
        int[] listNum = new int[NUMBERS];

        System.out.println("Insert 15 numbers: ");

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = sc.nextInt();
        }

        int num = listNum.length;

        for (int i = listNum.length - 1; i > 0; i--) {
            listNum[i] = listNum[i - 1];

        }

        listNum[0] = num;

        System.out.println("The numbers are:");

        for (int i = 0; i < listNum.length; i++) {
            System.out.println(listNum[i]);
        }
    }

    static void Ex5() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 05 ----------\n");
        System.out.println();

        int NUMBER = 100;
        int[] listNum = new int[NUMBER];

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = (int) (Math.random() * 20 + 0);
            System.out.print(listNum[i] + " ");
        }

        System.out.print("\n What number do you want to change?");
        int num1 = sc.nextInt();
        System.out.print("\n Insert the value to change:");
        int num2 = sc.nextInt();

        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] == num1) {
                listNum[i] = num2;
                System.out.print("--->" + listNum[i] + " ");
            } else System.out.print(listNum[i] + " ");
        }
    }

    static void Ex6() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 06 ----------\n");
        System.out.println();

        int NUMBER = 8;
        int[] listNum = new int[NUMBER];

        System.out.println("Insert 8 whole numbers: ");
        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = sc.nextInt();
        }
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] % 2 == 0) {
                System.out.println(listNum[i] + " par");
            } else System.out.println(listNum[i] + " inpar");
        }
    }

    static void Ex7() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 07 ----------\n");
        System.out.println();

        int NUMBER = 20;
        int[] listNum = new int[NUMBER];
        int j = 0;
        int pair;

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = (int) (Math.random() * 100 + 0);
            System.out.print(listNum[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] % 2 == 0) {
                pair = listNum[j];
                listNum[j] = listNum[i];
                listNum[i] = pair;
                j++;
            }
        }
        for (int i = 0; i < listNum.length; i++) {
            System.out.print(listNum[i] + " ");
        }
    }

    static void Ex8() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 08 ----------\n");
        System.out.println();

        int NUMBERS = 10;
        int[] listNum = new int[NUMBERS];
        boolean isPrime = false;
        int cont = 0;


        System.out.println("Insert 10 numbers:");

        while (cont < listNum.length) {
            //listNum[cont] = (int) (Math.random() * 100 + 0);
            listNum[cont] = sc.nextInt();
            cont++;
        }
        for (int i = 0; i < listNum.length; i++) {
            System.out.println(i + "-->" + listNum[i]);
        }

        cont = 0;

        int[] aux = new int[20];

        int contAux = 0;

        for (int i = 0; i < listNum.length; i++) {
            isPrime = true;
            for (int j = 2; j < listNum[i] - 1; j++) {
                if (listNum[i] % j == 0) {
                    isPrime = false;
                }
                if (!isPrime) {
                    aux[contAux] = listNum[i];
                    listNum[i] = -1;
                    contAux++;
                }
            }
        }

        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] != -1) {
                int leftOver = listNum[i];
                for (int j = 0; j < i; j++) {
                    if (listNum[i - j - 1] == -1) {
                        listNum[i - j - 1] = leftOver;
                        listNum[i - j] = -1;
                    }
                }
            }
        }
        int j = 0;
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] == -1) {
                listNum[i] = aux[j];
                j++;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < listNum.length; i++) {
            System.out.println(i + "-->" + listNum[i] + " ");
        }
    }


    static void Ex9() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 09 ----------\n");
        System.out.println();

        int NUMBER = 10;
        int[] listNum = new int[NUMBER];
        int[] finalList = new int[NUMBER];
        int first;
        int last;


        System.out.println("Insert 10 numbers:");

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = sc.nextInt();
            //listNum[i] = (int) (Math.random() * 100 + 2);
        }

        for (int i = 0; i < listNum.length; i++) {
            System.out.println(i + "-->" + listNum[i]);
        }

        boolean positions;
        do {
            System.out.print("Insert initial position from 0 to 9: ");
            first = sc.nextInt();

            System.out.print("Insert last position from 0 to 9 distinct from first : ");
            last = sc.nextInt();
            if (first < last && first >= 0 && last <= 9) {
                positions = true;

                int initalNum = listNum[first];

                finalList[last] = initalNum;

                for (int i = last; i < listNum.length - 1; i++) {
                    finalList[i + 1] = listNum[i];
                }

                finalList[0] = listNum[listNum.length - 1];

                for (int i = 1; i < listNum.length; i++) {
                    finalList[i] = listNum[i - 1];
                }

                for (int i = 0; i < finalList.length; i++) {
                    System.out.println(i + "-->" + finalList[i]);
                }

            } else {
                System.out.println("[ERROR] initial position must be lower than last and between from 0 to 9");
                System.out.println("TRY AGAIN");
                positions = false;
            }
        } while (!positions);


    }

    static void Ex10() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 10 ----------\n");
        System.out.println();

        int WORDS = 8;
        int aux = 0;

        String[] word = new String[WORDS];
        String[] result = new String[WORDS];
        String[] color = {"green", "red", "blue", "yellow", "orange", "pink", "black", "white", "purple"};

        System.out.println("Insert 8 words like colors or whatever you want: ");

        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next();
            for (String c : color) {
                if (word[i].equals(c)) {
                    result[aux++] = c;
                }
            }
        }

        for (int i = 0; i < word.length; i++) {
            System.out.println(i + "-->" + word[i]);
        }

        System.out.print("\n--------------\n");

        for (int i = 0; i < 8; i++) {
            boolean isColor = false;

            for (String c : color) {
                if (word[i].equals(c)) {
                    isColor = true;
                }
            }
            if (!isColor) {
                result[aux++] = word[i];
            }

            System.out.println(i + "-->" + result[i]);

        }
    }
}









