package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, resultado;
        char operador;

        System.out.println("Digite o primeiro Número");
        n1 = scanner.nextDouble();

        System.out.println("Digite o Operador (+ - / *");
        operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo Número");
        n2 = scanner.nextDouble();

        switch (operador){
            case '+':
                resultado = n1+n2;
                break;

            case '-':
                resultado = n1-n2;
                break;

            case '/':
                resultado = n1/n2;
                break;

            case '*':
                resultado = n1*n2;
                break;

            default:
                System.out.println("Operador não encontrado!");
                return;
        }

        System.out.println("Resultado: "+ resultado);

    }
}