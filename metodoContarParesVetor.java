import java.util.*;

public class Main {

    public static int contarPares(int vetor[]){
      int quantidade = 0;

      for(int i = 0; i < 5; i++){
        if(vetor[i] % 2 == 0){
          quantidade++;
        }
      } 
      return quantidade;
    }

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      int vetor[] = new int[5];

      for(int i = 0; i < 5; i++){

        System.out.println("Digite o número de posição " + (i + 1) + " no vetor: ");
        vetor[i] = entrada.nextInt();

      }
      int resultado;
      resultado = contarPares(vetor);
      System.out.println();
      System.out.println("Quantidade de números pares no vetor: " + resultado);

    }
}