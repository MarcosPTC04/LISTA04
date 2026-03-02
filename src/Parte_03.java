public class Parte_03 {

            /*No algoritmo de inversão in-place, nós trocamos o primeiro elemento com o último, o segundo com o penúltimo e assim
        por diante, até os índices se encontrarem no meio do vetor. Por causa disso, em um vetor de tamanho n são realizadas
        aproximadamente n/2 trocas, já que cada troca resolve duas posições ao mesmo tempo. Se o tamanho do vetor for par,
        serão exatamente n/2 trocas; se for ímpar, será (n−1)/2, porque o elemento central não precisa ser trocado.
            Em relação à complexidade, o algoritmo é considerado O(n), pois o número de operações cresce proporcionalmente ao
        tamanho do vetor. Mesmo sendo n/2 trocas, na notação Big-O nós desconsideramos constantes, então n/2 é simplificado
        para O(n). Não é O(1), porque a quantidade de operações depende do tamanho da entrada, e também não é O(n²), já que
        não há laços aninhados, apenas um percurso simples até o meio do vetor. */
}
