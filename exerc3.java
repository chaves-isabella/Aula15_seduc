import static java.lang.IO.*;
void main() {
    float totalcompra = 0;

    println("Digite o valor do produto ou 0 para finalizar: ");
    float precoproduto = Float.parseFloat(readln());

    while(precoproduto != 0) {
        totalcompra += precoproduto;

        println("Produto adicionado!");
        println("Digite o valor do próximo produto ou 0 para finalizar: ");

        precoproduto = Float.parseFloat(readln());
    }

    println("Valor total da compra: R$ " + totalcompra);
}
