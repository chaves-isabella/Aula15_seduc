import static java.lang.IO.*;
void main() {
    float soma = 0f;
    float media = 0f;
    float maior = Integer.MIN_VALUE;
    float menor = Integer.MAX_VALUE;
    float soma_pares = 0;
    float soma_impar = 0;
    float pares = 0;
    float impares = 0;
    for(int i = 1; i <= 10; i++){
        int num = Integer.parseInt(readln("Digite um número: "));
        soma = soma + num;

        if(num > maior){
            maior = num;
        }
        if(num < menor){
            menor = num;
        }
        if(num % 2 == 0){
            soma_pares = soma_pares + num;
            pares += 1;
        }
        if(num % 2 != 0){
            soma_impar = soma_impar + num;
            impares += 1;
        }
        if(num % 2 == 0){

        }
    }
    println("Soma = " + soma);
    media = soma / 5;
    println("Média = " + media);
    println("O maior número = " + maior);
    println("O menor número = " + menor);
    println("A soma dos números pares = " + soma_pares);
    println("A soma dos números ímpares = " + soma_impar);
    println("Quantidede de números pares = " + pares);
    println("Quantidade de números ímpares = " + impares);
}
