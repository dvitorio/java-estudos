import java.util.*;

public class Main {

  static abstract class Pessoa{
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

    public abstract void apresentar(); 
  }

  static class Aluno extends Pessoa{
    private String matricula;
    private double nota1;
    private double nota2;

    Aluno(String nome, int idade, String matricula, double nota1, double nota2){
      super(nome, idade);
      this.matricula = matricula;
      this.nota1 = nota1;
      this.nota2 = nota2;
    }
    public String getMatricula(){
      return matricula;
    }
    public double getNota1(){
      return nota1;
    }
    public double getNota2(){
      return nota2;
    }
    @Override
    public void apresentar() {
      System.out.println("Olá! Meu nome é " + getNome() + " e sou aluno da escola.");
    }
    //Calcular média
    public double calcularMedia(){
      double media = (nota1 + nota2) / 2;
      return media;
    }
    //Mostrar situação do Aluno
    public String mostrarSituacao(){
      double media = calcularMedia();
      if(media < 5){
        return "Reprovado!";
      }
      else if(media >=5 && media < 7){
        return "Recuperação!";
      }
      else{
        return "Aprovado!";
      }
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
    @Override
    public void apresentar() {
    System.out.println("Olá! Meu nome é " + getNome() + " e sou professor de " + getDisciplina() + " da Rede SESI.");
    }

    public String getDisciplina(){
      return disciplina;
    }
    public double getSalario(){
      return salario;
    }

  }

  static class Turma{
    private String nome;
    private int serie;
    private String turno;
    private ArrayList<Aluno> alunos;

    Turma(String nome, int serie, String turno){
      this.nome = nome;
      this.serie = serie;
      this.turno = turno;
      this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
      alunos.add(aluno);
    }
    public void listarAlunos(){
      for(Aluno aluno : alunos){
        System.out.println("Nome:           " + aluno.getNome());
        System.out.println("Idade:          " + aluno.getIdade() + " anos");
        System.out.println("Matrícula:      " + aluno.getMatricula());
        System.out.println("Nota 1:         " + aluno.getNota1());
        System.out.println("Nota 2:         " + aluno.getNota2());
        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Situação:       " + aluno.mostrarSituacao());
        System.out.println("----------------------------");
      }
    }

    public String getNome(){
      return nome;
    } 
    public int getSerie(){
      return serie;
    } 
    public String getTurno(){
      return turno;
    } 
  
    public int quantidadeAlunos() {
    return alunos.size();
    }

    public void mostrarDadosTurma(){
      System.out.println("============= TURMA ============");
      System.out.println("Nome: " + getNome());
      System.out.println("Série: " + getSerie());
      System.out.println("Turno: " + getTurno());
      System.out.println("Quantidade de alunos: " + quantidadeAlunos());
      System.out.println("================================");
    }

  }

    public static void main(String[] args) {

      Turma turma = new Turma("3° ANO", 3, "Matutino");

      Aluno aluno = new Aluno("Rafael Alves da Silva Costa", 7, "BA-2019", 8.2, 6.2);

      Professor professor = new Professor("Daniel Vitorio", 47, "Matemática", 6890);

      turma.adicionarAluno(aluno);

      turma.listarAlunos();

      aluno.apresentar();
      professor.apresentar(); 
      turma.mostrarDadosTurma();


    }
}