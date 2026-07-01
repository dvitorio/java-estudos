import java.util.*;

public class Main {

    // Método que soma todos os números pares
    public static int somaPares(int numeros[]){

        int somaPar = 0;

        for(int i = 0; i < 5; i++){

            if(numeros[i] % 2 == 0){
                somaPar = somaPar + numeros[i];
            }

        }

        return somaPar;
    }

    // Método que conta quantos números pares existem
    public static int contarPares(int numeros[]){

        int contador = 0;

        for(int i = 0; i < 5; i++){

            if(numeros[i] % 2 == 0){
                contador++;
            }

        }

        return contador;
    }

    // Método que calcula a média dos pares
    public static double mediaPares(int numeros[]){

        // Chama outro método
        int soma = somaPares(numeros);

        // Chama outro método
        int quantidade = contarPares(numeros);

        if(quantidade > 0){
            return (double) soma / quantidade;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.print("Digite o número da posição "
                             + (i + 1) + ": ");

            numeros[i] = entrada.nextInt();

        }

        double resultado = mediaPares(numeros);

        System.out.println();
        System.out.println(
            "Média dos números pares: " + resultado
        );

    }
}