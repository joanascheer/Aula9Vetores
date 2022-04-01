import java.util.Scanner;

public class Exercicio2Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String listaDeNomes[] = new String [10];

        for (int i = 0; i < listaDeNomes.length; i++) {
            System.out.println("Nome: ");
            String nome = leitor.nextLine();
            listaDeNomes[i] = nome;
        }

        for(int i = 0; i < listaDeNomes.length; i++) {
            System.out.println("Posição " +i+ ": " +listaDeNomes[i]);
        }

    }
}