import java.util.*;

public class Main {

  static class Pessoa{
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
  }

  public String getNome(){
    return nome;
  }

  public int getIdade(){
    return idade;
  }

  }

  static class Aluno extends Pessoa{
    private String matricula;

    Aluno(String nome, int idade, String matricula){

      super(nome, idade); //super indica os atributos comuns à classe 'pai' e à classe 'filho'

      this.matricula = matricula;

    }
    public String getMatricula(){
    return matricula;
  }
  }
  
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println("Qual o nome do aluno?");
      String nome = entrada.nextLine();

      System.out.println("Informe a idade do aluno: ");
      int idade = entrada.nextInt();

      entrada.nextLine();// Para consumir o 'ENTER'

      System.out.println("Agora digite sua matrícula: ");
      String matricula = entrada.nextLine();

      Aluno aluno1 = new Aluno(nome, idade, matricula);

      System.out.println("========== Informações do aluno ======= ");
      System.out.println("Nome:      " + aluno1.getNome());
      System.out.println("Idade:     " + aluno1.getIdade() + " anos");
      System.out.println("Matrícula: " + aluno1.getMatricula());

      

      

    }
}