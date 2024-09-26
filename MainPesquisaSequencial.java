import java.util.Random;

public class MainPesquisaSequencial {
    public static void main(String[] args) {
        int i, pos, elemento;
        int[] vetor = new int[5]; // Vetor de inteiros com 5 posições.
        Random random = new Random(); // Gerador de números aleatórios.
        Pesquisa pesquisa = new Pesquisa();

        // Preenchendo o vetor com números aleatórios:
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99.
        }

        // Exibindo o vetor:
        for (i = 0; i < vetor.length; i++) {
            System.out.println("vet[" + i + "] = " + vetor[i]);
        }

        elemento = random.nextInt(100);
        System.out.println("Elemento procurado: " + elemento);
        pos = pesquisa.sequencial(vetor, elemento, 0, vetor.length - 1);
        if (pos >= 0)
            System.out.println("O elemento foi encontrado na posição " + pos + " do vetor.");
        else
            System.out.println("O elemento não foi encontrado no vetor.");
    }
}
