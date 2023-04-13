import java.util.Random;
import java.util.Scanner;

public class gerandoNumeroAleatorio {
    public static void main(String[] args) {

        Scanner adivinhacaoNumero = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 100, você possuí 5 tentativas para acertar, se perder o seu botico é meu :");
        int numeroAleatorio = new Random().nextInt(100);
        int tentativaAdivinhacao = 5;


      while (tentativaAdivinhacao > 0) {
          tentativaAdivinhacao--;
          int valorAdivinhacao = adivinhacaoNumero.nextInt();
          if (valorAdivinhacao == numeroAleatorio) {
              System.out.println("Parabéns, você acertou!");
              break;
          }
          if (tentativaAdivinhacao == 0) {
              System.out.println("VOCÊ PERDEU! SUAS TENTATIVAS SÃO O TOTAL DE " + tentativaAdivinhacao + " SEU BOTICO É MEU HAHAHA!");
              break;
          }

          if (valorAdivinhacao != numeroAleatorio) {

              if (valorAdivinhacao < numeroAleatorio) {
                  System.out.println("O número é maior, tente novamente, você possuí " + tentativaAdivinhacao + " tentativas");
              }
              if (valorAdivinhacao > numeroAleatorio) {
                  System.out.println("O número é menor, tente novamente, você possuí " + tentativaAdivinhacao + " tentativas");
              }
          }
      }
    }
}
