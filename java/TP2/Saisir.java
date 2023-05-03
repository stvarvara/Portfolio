package TP2;

import java.util.Scanner;

public class Saisir {
    private static Scanner scanner = new Scanner(System.in);
    public static int entier() {
        System.out.println("Entrez un entier :");
        String ligne = scanner.next();
        return Integer.parseInt(ligne);
    }
    public static double reeld() {
        System.out.println("Entrez un réel (double) :");
        String ligne = scanner.next();
        return Double.valueOf(ligne);
    }

    public static float reelf() {
        System.out.println("Entrez un réel (float) :");
        String ligne = scanner.next();
        return Float.valueOf(ligne);
    }

    public static String chaine() {
        System.out.println("Entrez une chaîne de caractères :");
        return scanner.next();
    }

    public static char car() {
        System.out.println("Entrez un caractère :");
        String ligne = scanner.next();
        return ligne.charAt(0);
    }
}
