import java.util.Scanner;

public class Exercicio4Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos itens você vai comprar? ");
        int qtdeItens = leitor.nextInt();

        String[] vetor = new String [qtdeItens];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %2do. item: ", (i+1));
            String item = leitor.next();
            vetor[i] = item;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Item " +(i+1)+ ": " +vetor[i]);
        }
        
    }
    
}

/* Faça um programa que receba de lista de compras sendo que o
usuário irá inserir a quantidade de itens que quer adicionar na lista
de compras e após inserir a quantidade o programa deverá permitir
que o usuário insira os produtos nessa lista. Exiba a lista completa
para o usuário. */