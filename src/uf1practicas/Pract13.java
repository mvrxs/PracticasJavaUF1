package uf1practicas;

import java.util.Scanner;

public class Pract13 {

    static Scanner sc = new Scanner(System.in);

    static void Ex1() {
        //sc.useDelimiter(" ");
        /*
        Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los
        valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
        dispuestos en forma de tabla como se muestra en la figura.
         */
        int ROW = 3;
        int COLUMN = 6;
        int[][] num = new int[ROW][COLUMN];

        System.out.println("Insert the values for rows: ");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                //num[i][j] = sc.nextInt();
                num[i][j] = (int) (Math.random() * 100 + 0);
            }
        }
        System.out.println("        COL 0     COL 1     COL 2     COL 3     COL 4     COL 5");
        System.out.println("       --------------------------------------------------------");
        for (int i = 0; i < ROW; i++) {
            System.out.print("Fila " + i + "| ");
            for (int j = 0; j < COLUMN; j++) {
                System.out.printf("%-10d", num[i][j]);
            }
            System.out.println();
        }
    }

    static void Ex2() {
    }

    static void Ex3() {
    }

    static void Ex4() {
    }

    static void Ex5() {
    }

    static void Ex6() {
    }

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
                case 0 -> {
                    System.out.println("Good Bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        } while (true);
    }
}
