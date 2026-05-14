import static java.lang.IO.*;
void main() {
    double saldo = 500.00;
    int opcao;

    do {
        println("\n--- CAIXA ELETRÔNICO ---");
        println("1 - Saque");
        println("2 - Depósito");
        println("3 - Saldo");
        println("0 - Sair");
        print("Opção: ");

        opcao = Integer.parseInt(readln());

        // Substituindo o switch por if
        if (opcao == 1) {
            print("Valor do saque: ");
            double valor = Double.parseDouble(readln());

            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                println("Sucesso! Retire seu dinheiro.");
            } else if (valor > saldo) {
                println("Erro: Saldo insuficiente!");
            } else {
                println("Erro: Valor inválido!");
            }

        } else if (opcao == 2) {
            print("Valor do depósito: ");
            double valor = Double.parseDouble(readln());

            if (valor > 0) {
                saldo += valor;
                println("Sucesso! Depósito realizado.");
            } else {
                println("Erro: Valor inválido!");
            }

        } else if (opcao == 3) {
            println("Seu saldo é: R$ " + saldo);

        } else if (opcao == 0) {
            println("Saindo...");

        } else {
            println("Opção inválida!");
        }

    } while (opcao != 0);
}
