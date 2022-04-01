import java.util.Scanner;

public class Exercicio1Vetor {
    public static void main(String[] args) {
        
        int vetor[] = new int [10];
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int soma = 0;

        for (i = 0; i<10; i++) {
            System.out.printf("Digite %2do. valor de %d: ", (i+1), 10);
            vetor[i] = leitor.nextInt();
            soma = soma + vetor[i];
        }

        System.out.println("A soma dos valores é: " +soma);
    }
    
}
