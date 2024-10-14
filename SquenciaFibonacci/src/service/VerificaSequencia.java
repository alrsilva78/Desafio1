package service;

import controller.CalculoFibonacci;

public class VerificaSequencia {

     // Método para verificar se o número informado faz parte da sequência de Fibonacci gerada
    public static void verificaSequencia(int numero, CalculoFibonacci calculoFibonacci) {
        if (calculoFibonacci.getFibonacciSequence().contains(numero)) {
            System.out.println("O número " + numero + " faz parte da sequência de Fibonacci impressa.");
        } else {
            System.out.println("O número " + numero + " NÃO faz parte da sequência de Fibonacci impressa.");
        }
    }

}
