public class Parte_02 {

    /*Questão 6 – Teste de Mesa (inverter_lista)

    Vetor inicial:
    [10, 20, 30, 40, 50]

    Iteração | início (índice) | fim (índice) | temp (valor) | Estado do Vetor
    ---------------------------------------------------------------------------
    Início   | -               | -            | -            | [10, 20, 30, 40, 50]
    1ª       | 0               | 4            | 10           | [50, 20, 30, 40, 10]
    2ª       | 1               | 3            | 20           | [50, 40, 30, 20, 10]
    3ª       | 2               | 2            | -            | (laço encerrado)

    Resultado Final:
    [50, 40, 30, 20, 10]*/

    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50};

        inverterLista(vetor);

        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    /* Questão 6 */
    public static void inverterLista(int[] vetor) {

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }
}
