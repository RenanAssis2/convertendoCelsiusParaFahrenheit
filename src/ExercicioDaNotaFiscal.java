import java.util.Scanner;

public class ExercicioDaNotaFiscal {
    public static void main(String[] args) {

        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\n");

        //Dados do Usuario
        String nome = "Renan";
        String tipoConta = "Corrente";
        int saldoInicial = 20000;

        int saldoAtual;
        int operacaoInicial = 1;
        saldoAtual = saldoInicial;

        System.out.println("Nome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoConta);
        System.out.println("Saldo Inicial:      " + saldoInicial);

        while (operacaoInicial == 1){

            System.out.println("Operações:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            Scanner operacao = new Scanner(System.in);
            int auxiliar = operacao.nextInt();

            if (auxiliar == 1) {
                System.out.println("O saldo atual é: " + saldoAtual);
                System.out.println("\n");
                continue;

            }
            if (auxiliar == 2) {

                System.out.println("Informe o valor a receber:");
                int valorReceber = operacao.nextInt();
                saldoAtual = saldoAtual + valorReceber;
                System.out.println("Saldo atualizado R$" + saldoAtual);
                continue;

            }
            if (auxiliar == 3) {
                System.out.println("Informe o valor para transferir:");
                int valorTransferir = operacao.nextInt();
                saldoAtual = saldoAtual - valorTransferir;
                System.out.println("Saldo atualizado R$" + saldoAtual);
                continue;

            }
            if (auxiliar == 4){
                System.out.println("Sistema desligado, obrigado!");
                break;

            }
            else{
                System.out.println("Operação invalida");
                continue;
            }


        }

    }
}
