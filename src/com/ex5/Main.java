package com.ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);

        int codigoPeca1= scanner.nextInt();
        int numerosPeca1= scanner.nextInt();
        double valorUnitarioPeca1= scanner.nextDouble();
        double valorPagarPeca1= numerosPeca1 * valorUnitarioPeca1;

        int codigoPeca2= scanner.nextInt();
        int numerosPeca2= scanner.nextInt();
        double valorUnitarioPeca2= scanner.nextDouble();
        double valorPagarPeca2= numerosPeca2 * valorUnitarioPeca2;

        double total = valorPagarPeca1+ valorPagarPeca2;


        System.out.printf("VALOR A PAGAR:  R$ %.2f%n ",total);
        scanner.close();




    }
}
