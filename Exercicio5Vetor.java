import java.util.Scanner;

public class Exercicio5Vetor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da banda: ");
        String banda = leitor.nextLine();

        String [] listaMusicas = new String [3];

        for (int i = 0; i < listaMusicas.length; i++) {
            System.out.printf("Digite a %2da música: ", (i+1));
            String musica = leitor.nextLine();
            listaMusicas[i] = musica;
        }


        System.out.println("*********************");
        System.out.println(banda);
        System.out.println("*********************");

        for(int i = 0; i < listaMusicas.length; i++) {
            System.out.println("Música " +(i+1)+ ": " +listaMusicas[i]);
        }
    }
    
}

/* Faça um programa que permita que o usuário digite o nome de uma
banda musical e insira o nome de 3 músicas dessa banda, as músicas
deverão ser armazenadas e no final o programa deverá mostrar a
seguinte mensagem:

NomeDaBanda

Musica1
Musica2
Musica3 */