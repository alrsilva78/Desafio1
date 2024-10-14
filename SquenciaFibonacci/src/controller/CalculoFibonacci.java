package controller;

import model.DadosEntrada;
import service.VerificaSequencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoFibonacci extends DadosEntrada {

    Scanner scanner = new Scanner(System.in);

    private List<Integer> fibonacciSequence = new ArrayList<>(); // Lista para armazenar a sequência gerada

    public CalculoFibonacci(int numCalc, int numPrimeiroCalc, int numSegundoCalc) {
        super(numCalc, numPrimeiroCalc, numSegundoCalc);
    }

    // Método para calcular a sequência de Fibonacci e armazená-la
    public void calculoFibonacci() {

        setNumPrimeiro(0); // Primeiro número da sequência
        setNumSegundo(1);  // Segundo número da sequência

        System.out.print("Informe o número até o qual deseja calcular a Sequência Fibonacci: ");
        setNum(scanner.nextInt());
        scanner.nextLine();

        // Adiciona os dois primeiros números à lista de Fibonacci
        fibonacciSequence.add(getNumPrimeiro());
        fibonacciSequence.add(getNumSegundo());

        System.out.print(getNumPrimeiro() + " -> " + getNumSegundo());

        // Gera a sequência de Fibonacci até o número limite
        while (true) {
            int nextNum = getNumPrimeiro() + getNumSegundo();

            // Condição de parada
            if (nextNum > getNum()) {
                break;
            }
            System.out.print(" -> " + nextNum);
            fibonacciSequence.add(nextNum); // Armazena o número na lista

            // Atualiza os números
            setNumPrimeiro(getNumSegundo());
            setNumSegundo(nextNum);
        }

        System.out.println(" -> Fim");

        // Verificar se o número informado faz parte da sequência gerada
        VerificaSequencia.verificaSequencia(getNum(),this);
    }
    public List<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }
   
}
