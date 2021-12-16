package com.ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);

        double A= scanner.nextDouble();
        double B= scanner.nextDouble();
        double C= scanner.nextDouble();
        double pi= 3.14159;

        double areaTriangulo= A*C/2;
        double areaCirculo= pi*(C*C);
        double areaTrapezio= (A+B)*C/2;
        double areaQuadrado = B*B;
        double areaRetangulo= A*B;


        System.out.printf(" TRIANGULO: %.3f%n ",areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n ",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n ",areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n ",areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n ",areaRetangulo);


        scanner.close();




    }
}
