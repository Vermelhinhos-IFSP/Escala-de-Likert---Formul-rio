import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    int atendimento = 0;
    int pontualidade = 0;
    int qualidade = 0;
    int avaliacaoGeral = 0;
    int xp = 0;
    String comentario = "";

    System.out.println("\nEscala de avaliacao:\n-2 = >:( \n-1 = :( \n 0 = :| \n 1 = :) \n 2 = :D \n\nPesquisa de satisfacao:\n");
    
    System.out.println("O atendimento do funcionario foi cordial e atencioso?");
    atendimento = Scan.nextInt();
    xp += atendimento;
    
    System.out.println("Quanto ao tempo para a chegada do funcionario, o que lhe pareceu?");
    pontualidade = Scan.nextInt();
    xp += pontualidade;
    
    System.out.println("O servico realizado foi bem feito?");
    qualidade = Scan.nextInt();
    xp += qualidade;

    System.out.println("Avaliacao geral do serviço");
    avaliacaoGeral = Scan.nextInt();
    xp += avaliacaoGeral;
    
    System.out.println("O que aconteceu?");
    comentario = Scan.next();
    
    System.out.println("\n\nResultado:\n");
    System.out.println("Atendimento: " + resultado(atendimento));
    System.out.println("pontualidade: " + resultado(pontualidade));
    System.out.println("qualidade: " + resultado(qualidade));
    System.out.println("Avaliacao Geral: " + resultado(avaliacaoGeral));
    System.out.println("Comentario: " + comentario);
    System.out.println("Experiencia concedida ao funcionario: " + xp + " xp");
    
    Scan.close();
  }

  public static String resultado(int avaliacao) {
    String resultado = "";

    if(avaliacao == -2) {
      resultado = "*Carinha Brava* >:(";
    } 
    if(avaliacao == -1) {
      resultado = "*Carinha Triste* :(";
    }
    if(avaliacao == 0) {
      resultado = "*Carinha Neutra* :|";
    }
    if(avaliacao == 1) {
      resultado = "*Carinha Satisfatoria* :)";
    }
    if(avaliacao == 2) {
      resultado = "*Carinha Feliz* :D";
    }
    return resultado;
  }
}