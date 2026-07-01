import java.util.*;

public class Main {

  static class Pessoa{
    
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }

    Pessoa(){

    }
    //Getters
    public String getNome(){
      return nome;
    }

    public int getIdade(){
      return idade;
    }
  }

  static class Professor extends Pessoa{

    private String disciplina;
    private double salario;

    Professor(String nome, int idade, String disciplina, double salario){

      super(nome, idade);

      this.disciplina = disciplina;
      this.salario = salario;

    }
    //Getters
      public String getDisciplina(){
        return disciplina;
      }

      public double getSalario(){
        return salario;
      }

  }

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println("Qual o nome do professor?");
      String nome = entrada.nextLine();

      System.out.println("Informe a idade:");
      int idade = entrada.nextInt();

      entrada.nextLine();

      System.out.println("Agora informe o nome da disciplina lecionada: ");
      String disciplina = entrada.nextLine();

      System.out.println("Por fim, informe o salário recebido pelo professor: ");
      double salario = entrada.nextDouble();

      Professor professor1 = new Professor(nome, idade, disciplina, salario);

      System.out.println("====== Informações do professor ========");
      System.out.println("Professor:  " + professor1.getNome());
      System.out.println("Idade:      " + professor1.getIdade());
      System.out.println("Disciplina: " + professor1.getDisciplina());
      System.out.println("Salário:    " + professor1.getSalario());

      

    }
}