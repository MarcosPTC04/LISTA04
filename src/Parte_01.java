import java.util.Scanner;
public class Parte_01 {

    public static void main(String[] args) {

        /* Questão 1 */
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double media = calcularMedia(notas);
        int acimaMedia = contarAcimaMedia(notas, media);
        double maiorNota = encontrarMaiorNota(notas);

        System.out.println("=== Questão 1 ===");
        System.out.println("Média: " + media);
        System.out.println("Acima da média: " + acimaMedia);
        System.out.println("Maior nota: " + maiorNota);


        /* Questão 2 */
        int valor = 180;
        int[] cedulas = calcularCedulas(valor);

        System.out.println("\n=== Questão 2 ===");
        System.out.println("Notas de 50: " + cedulas[0]);
        System.out.println("Notas de 20: " + cedulas[1]);
        System.out.println("Notas de 10: " + cedulas[2]);


        /* Questão 3 */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Questão 3 ===");
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        String resultadoSenha = validarSenha(senha);
        System.out.println(resultadoSenha);


        /* Questão 4 */
        int totalSegundos = 3665;
        int[] tempo = converterTempo(totalSegundos);

        System.out.println("\n=== Questão 4 ===");
        System.out.println(tempo[0] + "h, " + tempo[1] + "min e " + tempo[2] + "seg");


        /* Questão 5 */
        int[] numeros = {1, 2, 3, 4, 5};
        boolean unico = verificarElementosUnicos(numeros);

        System.out.println("\n=== Questão 5 ===");
        if (unico) {
            System.out.println("Todos os números são únicos.");
        } else {
            System.out.println("Há números repetidos.");
        }

        sc.close();
    }


    /* Questão 1 */

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static int contarAcimaMedia(double[] notas, double media) {
        int contador = 0;
        for (double nota : notas) {
            if (nota > media) {
                contador++;
            }
        }
        return contador;
    }

    public static double encontrarMaiorNota(double[] notas) {
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }


    /* Questão 2 */

    public static int[] calcularCedulas(int valor) {
        int nota50 = valor / 50;
        valor %= 50;

        int nota20 = valor / 20;
        valor %= 20;

        int nota10 = valor / 10;

        return new int[]{nota50, nota20, nota10};
    }


    /* Questão 3 */

    public static String validarSenha(String senha) {
        boolean tamanhoValido = senha.length() >= 8;
        boolean temEspecial = false;

        String especiais = "@#$%&*";

        for (int i = 0; i < senha.length(); i++) {
            if (especiais.contains(String.valueOf(senha.charAt(i)))) {
                temEspecial = true;
                break;
            }
        }

        if (tamanhoValido && temEspecial) {
            return "Senha Válida";
        } else {
            String erro = "Senha Inválida\n";
            if (!tamanhoValido) {
                erro += "- Deve ter pelo menos 8 caracteres.\n";
            }
            if (!temEspecial) {
                erro += "- Deve conter pelo menos um caractere especial (@,#,$,%,&,*).\n";
            }
            return erro;
        }
    }


    /* Questão 4 */

    public static int[] converterTempo(int totalSegundos) {
        int horas = totalSegundos / 3600;
        totalSegundos %= 3600;

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        return new int[]{horas, minutos, segundos};
    }


    /* Questão 5 */

    public static boolean verificarElementosUnicos(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


