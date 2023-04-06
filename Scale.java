import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    int atendimento = 0;
    int pontualidade = 0;
    int qualidade = 0;
    int avaliacaoGeral = 0;
    int xp = 0;

    System.out.println("\nEscala de avaliação:\n-2 = >:( \n-1 = :( \n 0 = :| \n 1 = :) \n 2 = :D \n\nPesquisa de satisfação:\n");
    
    System.out.println("O atendimento do funcionário foi cordial e atencioso?");
    atendimento = Scan.nextInt();
    xp += atendimento;
    
    System.out.println("Quanto ao tempo para a chegada do funcionário, o que lhe pareceu?");
    pontualidade = Scan.nextInt();
    xp += pontualidade;
    
    System.out.println("O serviço realizado foi bem feito?");
    qualidade = Scan.nextInt();
    xp += qualidade;
    avaliacaoGeral = xp;
    
    System.out.println("\n\nResultado:\n");
    System.out.println("Atendimento: " + resultado(atendimento));
    System.out.println("Pontualidade: " + resultado(pontualidade));
    System.out.println("Qualidade: " + resultado(qualidade));
    System.out.println("\nAvaliação Geral: " + resultado(avaliacaoGeral));
    System.out.println("Experiência concedida ao funcionário: " + xp + " xp");

    if(xp < 0) {
      String comentario = "";
      
      System.out.println("\nPesquisa de satisfação:\n");
    
      System.out.println("O que aconteceu?");
      comentario = Scan.next();
    
      System.out.println("\n\nResultado:\n");
      System.out.println("Avaliação Geral: " + resultado(avaliacaoGeral));
      System.out.println("Comentário: " + comentario);
    }
    
    Scan.close();
  }

  public static String resultado(int avaliacao) {
    String resultado = "";

    if(avaliacao <= -2) {
      resultado = "*Carinha Brava* >:()";
    } 
    if(avaliacao == -1) {
      resultado = "*Carinha Triste* :()";
    }
    if(avaliacao == 0) {
      resultado = "*Carinha Neutra* :|";
    }
    if(avaliacao == 1) {
      resultado = "*Carinha Satisfatoria* :)";
    }
    if(avaliacao >= 2) {
      resultado = "*Carinha Feliz* :D";
    }
    
    return resultado;
  }
}