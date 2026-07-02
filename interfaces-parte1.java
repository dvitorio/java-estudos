import java.util.*;

public class Main {

    public interface Nadador{
      void nadar();
    }

    public interface Corredor{
      void correr();
    }

    public interface Voador{
      void voar();
    }

    static class SuperHeroi implements Nadador, Corredor, Voador{

      @Override
      public void nadar(){
        System.out.println("Olá, sou o melhor nadador do mundo!");
      }

      @Override
      public void correr(){
        System.out.println("Também sou o velocista mais veloz do planeta!");
      }

      @Override
      public void voar(){
        System.out.println("Nos céus ninguém me alcança!");
      }
    }

    public static void main(String[] args) {

      SuperHeroi heroi = new SuperHeroi();

      heroi.nadar();
      heroi.correr();
      heroi.voar();

    }


}