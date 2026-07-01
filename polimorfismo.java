import java.util.*;

public class Main {

  static class Pessoa{

    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }

    Pessoa(){}

    public String getNome(){
      return nome;
    }

    public int getIdade(){
      return idade;
    }

    public void apresentar(){
      System.out.println("Olá!");
    }


  }

  static class Aluno extends Pessoa{

    private String matricula;

    Aluno(String nome, int idade, String matricula){
      super(nome, idade);
      this.matricula = matricula;
    }

    @Override
    public void apresentar(){
      System.out.println("Olá! Sou aluno da rede SESI!");
    }

  }

  static class Professor extends Pessoa{

    private String disciplina;

    Professor(String nome, int idade, String disciplina){
      super(nome, idade);
      this.disciplina = disciplina;
    }

    @Override
    public void apresentar(){
      System.out.println("Olá! Sou professor de Matemática da Rede SESI!");
    }

  }

    public static void main(String[] args) {

      Pessoa pessoa1 = new Pessoa("Nova pessoa", 0);
      Aluno aluno1 = new Aluno("Rafael Alves", 7, "BA512-2019");
      Professor professor1 = new Professor("Daniel Vitorio", 47, "BA512-2026");

      pessoa1.apresentar();
      aluno1.apresentar();
      professor1.apresentar();

    }
}