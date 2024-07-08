/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B */

package exercicios;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de valores
        System.out.println("Digite os valores de A,B,C: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        // Final PI
        final double pi = 3.14159;

        // Equações
        double areaTriang = (a * c) / 2;
        double areaCirc = pi * (c * c);
        double areaTrap = ((a + b) * c) / 2;
        double areaQuad = b * b;
        double areaRet = a * b;

        // Saída dos valores
        System.out.printf("TRIÂNGULO: %.3f%n", areaTriang);
        System.out.printf("CIRCULO: %.3f%n", areaCirc);
        System.out.printf("TRAPÉZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETÂNGULO: %.3f%n", areaRet);

        scan.close();        
    }

}
