import java.util.Scanner;
public class ContaBancaria {
           public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            String nome = "vinicius";
            String tipoConta = "corrente";
            double saldo = 2500;
            int escolha = 0;

            System.out.println("Nome "+ nome);
            System.out.println("Conta"+ tipoConta);
            System.out.println("Saldo atual "+saldo);


            while (escolha != 4){
                System.out.println("#### Operações ####");
                System.out.println("1- Consultar saldos");
                System.out.println("2- Receber valor");
                System.out.println("3- Transferir valor");
                System.out.println("4- Sair");
                escolha = leitura.nextInt();

                if(escolha == 1){
                    System.out.println("Seu saldo atual é "+saldo);
                }
                else if (escolha == 2){
                    System.out.println("informa o valor a recebido ");
                    double recebido = leitura.nextDouble();
                    double saldoAtual = saldo+recebido;
                    System.out.println("Seu saldo Ataul é "+ saldoAtual);
                    saldo = saldoAtual;
                }
                else if (escolha == 3) {
                    System.out.println("informa o valor que deseja transferir ");
                    double valorTrasferir = leitura.nextDouble();
                    if(saldo< valorTrasferir){
                        System.out.println("Saldo insufciente ");
                    }
                    else {
                        System.out.println("transferencia realizada com sucesso");
                        double saldo2 = saldo-valorTrasferir;
                        saldo = saldo2;
                    }
                }
                else if (escolha == 4) {
                    System.out.println("Sair do sistema ");

                }
            }
           }
}


