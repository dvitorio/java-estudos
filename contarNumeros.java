import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = -1;
        int contador = 0;
        double media = 0;

        while(numero != 0){
          System.out.println("Digite um número: ");
          numero = entrada.nextInt();
            if(numero != 0){
              soma = soma + numero;
              contador += 1;
              media = soma / contador;
            }

        }
        System.out.println("Você digitou " + contador + " números");
        System.out.println("Soma total: " + soma);
        System.out.println("Média: " + media);

    }

}