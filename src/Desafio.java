import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        float saldo = 215;
        int status = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome e sobrenome? ");
        String nome = scanner.nextLine();

        System.out.println("*******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.printf("Nome: %S ", nome);
        System.out.println("Tipo conta: Corrente");
        System.out.printf("Saldo inicial: R$ %.2f\n", saldo);
        System.out.println("*******************************");

        String menu = """
                \nOperações
                **************************
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                **************************
                Digite a opção desejada:
                """;

        while(status != 4) {
            System.out.print(menu);
            status = scanner.nextInt();
            switch(status){
                case 1:
                    System.out.printf("seu saldo é: R$%.2f", saldo);
                    break;
                case 2:
                    System.out.print("Insira o valor recebido: ");
                    saldo = saldo + scanner.nextFloat();
                    break;
                case 3:
                    System.out.print("Insira o valor que deseja transferir: ");
                    saldo = saldo - scanner.nextFloat();
                    break;
                case 4:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }


    }
}
