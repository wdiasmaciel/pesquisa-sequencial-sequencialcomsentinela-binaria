import java.util.Random;

public class MainPesquisaSequencialComSentinela {
    public static void main(String[] args) {
        int i, pos, elemento;
        int[] vetor = new int[6]; // Vetor de inteiros com 5 + 1 = 6 posições.
        Random random = new Random(); // Gerador de números aleatórios.
        Pesquisa pesquisa = new Pesquisa();

        // Preenchendo o vetor com números aleatórios:
        for (i = 0; i < vetor.length - 1; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99.
        }

        // Exibindo o vetor:
        for (i = 0; i < vetor.length  - 1; i++) {
            System.out.println("vet[" + i + "] = " + vetor[i]);
        }

        elemento = random.nextInt(100);
        System.out.println("Elemento procurado: " + elemento);
        pos = pesquisa.sequencialComSentinela(vetor, elemento, 0, vetor.length - 2);
        if (pos >= 0)
            System.out.println("O elemento foi encontrado na posição " + pos + " do vetor.");
        else
            System.out.println("O elemento não foi encontrado no vetor.");
    }
}
