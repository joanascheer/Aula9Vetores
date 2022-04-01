import java.util.Scanner;

public class Exercicio3Vetor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int [10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número que ocupará a posição " +i+ " do vetor: ");
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                vetor[i] = numero;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Números pares: " +vetor[i]);
        }
    }
    
}

/* Faça um programa que receba 10 números inteiros, armazene-os e
verifique quais numeros são pares, e exiba para o usuário apenas os
números pares da lista. */
