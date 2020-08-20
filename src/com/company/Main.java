package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        boolean endGame = false;
        String playerStatement;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe od 0 do 1000. A ja odgadne ja w max 10 probach.");
        System.out.println("Odpowiadaj tylko: \"za duzo\", \"za malo\", \"albo zgadles\".");

        while (endGame == false) {

            int guess = (max - min) / 2 + min;

            System.out.println("Zgaduje " + guess);

            playerStatement = scanner.nextLine();

            if (playerStatement.equals("za malo")) {
                min = guess;
            } else if (playerStatement.equals("za duzo")) {
                max = guess;
            } else if (playerStatement.equals("zgadles")) {
                System.out.println("Wygrałem.");
                endGame = true;
            } else {
                System.out.println("nie oszukuj");
            }
        }

    }
}
