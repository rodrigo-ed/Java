package br.com.escola.notas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaDeNotas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            double nota1 = lerNota(scanner, "Digite a nota 1 (0-10): ");
            double nota2 = lerNota(scanner, "Digite a nota 2 (0-10): ");
            double nota3 = lerNota(scanner, "Digite a nota 3 (0-10): ");

            double media = (nota1 + nota2 + nota3) / 3.0;

            Aluno aluno = new Aluno(nome, media);

            System.out.printf("Media de %s: %.2f%n", aluno.getNome(), aluno.getMedia());
            System.out.println("Resultado: " + aluno.getResultado());
        }
    }

    // Método auxiliar para ler e validar uma nota
    private static double lerNota(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("Nota invalida! Digite um valor entre 0 e 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Por favor, digite um numero valido.");
                scanner.next(); // Limpa o buffer de entrada
            }
        }
    }
}