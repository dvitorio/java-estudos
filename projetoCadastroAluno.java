import java.util.*;

public class Main {

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      List<String> nomes = new ArrayList<>(); 

      System.out.println("Quantos alunos serão incluídos na lista? ");
        int quantidadeAlunos = entrada.nextInt();

        entrada.nextLine();

      for(int i = 0; i < quantidadeAlunos; i++){
        System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
        String aluno = entrada.nextLine();

        nomes.add(aluno);
      }
      
      System.out.println("Deseja cadastrar mais algum aluno? (Digite '1' para SIM e '2' para NÃO)");
      int opcao = entrada.nextInt();
      if(opcao == 1){
        System.out.println("Quantos alunos desja incluir na lista? ");
        quantidadeAlunos = entrada.nextInt();

        entrada.nextLine();

        for(int i = 0; i < quantidadeAlunos; i++){
          System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
          String aluno = entrada.nextLine();
          nomes.add(aluno);
        }
      }
      else if(opcao == 2){
        System.out.println("Obrigado por utilizar o sistema!");
      }
      else{
        System.out.println("Opção inválida!");
      }

      System.out.println("======= Alunos cadastrados ========");
      for(int i = 0; i < nomes.size(); i ++){
        System.out.println((i + 1) + " - " + nomes.get(i));
      }

    }

    }
