import java.util.Scanner;
//Mudanças realizadas aqui para rodar no teste automático. O código 1 pode ser operado perfeitamente pelo terminal, manualmente.
public class SimulacaoBancaria2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;

                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            // Adiciona uma quebra de linha após cada operação para garantir formatação correta
            if (continuar) {
                System.out.println();
            }
        }
        scanner.close(); // Fechar o Scanner no final do programa
    }
}

