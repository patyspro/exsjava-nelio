package com.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);

        int numeroFuncionario= scanner.nextInt();
        int horasTrabalhadas= scanner.nextInt();
        double valorHora= scanner.nextDouble();
        double salario= valorHora * horasTrabalhadas;





        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY= U$ %.2f%n ",salario);
        scanner.close();




    }
}
