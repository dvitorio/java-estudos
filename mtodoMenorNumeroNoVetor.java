import java.util.*;

public class Main {

    // Método responsável por encontrar
    // o menor número presente no vetor
    public static int menorNumero(int vetor[]){

        // Assume que o primeiro elemento
        // é o menor número inicialmente
        int menorNumero = vetor[0];

        // Percorre todas as posições do vetor
        for(int i = 0; i < 5; i++){

            // Se encontrar um número menor
            // que o menor atual, atualiza a variável
            if(vetor[i] < menorNumero){
                menorNumero = vetor[i];
            }
        }

        // Após analisar todo o vetor,
        // devolve o menor número encontrado
        return menorNumero;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criação do vetor com 5 posições
        int vetor[] = new int[5];

        // Preenchimento do vetor
        for(int i = 0; i < 5; i++){

            System.out.println(
                "Digite o número da " + (i + 1) + "ª posição:"
            );

            vetor[i] = entrada.nextInt();

        }

        // Chama o método maiorNumero(),
        // passando o vetor inteiro como parâmetro
        int resultado = menorNumero(vetor);

        // Mostra o valor retornado pelo método
        System.out.println("Menor valor: " + resultado);

    }
}