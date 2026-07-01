import java.util.*;

public class Main {

  static class Aluno{
    private String nome;
    private double nota1;
    private double nota2;

    Aluno(String nome, double nota1, double nota2){
      this.nome = nome;
      this.nota1 = nota1;
      this.nota2 = nota2;
    }

    //Métodos getters
    public String getNome(){
      return nome;
    }
    public double getNota1(){
      return nota1;
    }
    public double getNota2(){
      return nota2;
    }

    //Método que calcula média
    public double calcularMedia(){
      return (nota1 + nota2) / 2;
    }

    //Método que mostra situação do Aluno
    public String mostrarSituacao(){
      double media = calcularMedia();
      if(media < 5){
        return "Reprovado!";
      }
      else if(media >= 5 && media < 7){
        return "Recuperação!";
      }
      else{
        return "Aprovado!";
      }
    }

  }

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println("Quantos alunos deseja cadastrar?");
      int quantAlunos = entrada.nextInt();
      entrada.nextLine(); //Para consumir o ENTER

      ArrayList<Aluno> alunos = new ArrayList<>();

      for(int i = 0; i < quantAlunos; i++){
        System.out.println("Digite o nome do estudante n° " + (i + 1) + ":");
        String nome = entrada.nextLine();

        System.out.println("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = entrada.nextDouble();

        entrada.nextLine();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        alunos.add(aluno);
      }

      double somaMedias = 0;
      double maiorMedia = 0;
      Aluno melhorAluno = null;

      System.out.println("-------Alunos cadastrados--------");
      for(Aluno aluno : alunos){

        double media = aluno.calcularMedia();
        somaMedias += media; 

        if(media > maiorMedia){
          maiorMedia = media;
          melhorAluno = aluno;
        }

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Situação geral do aluno: " + aluno.mostrarSituacao());
        System.out.println("---------------------------------------------------");
      }

      double mediaTurma = somaMedias / alunos.size();

      System.out.println("Média geral da turma: " + mediaTurma);
      System.out.println("Maior média: " + maiorMedia);
      System.out.println("Aluno com a maior média: " + melhorAluno.getNome());




    }
}