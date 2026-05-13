import static java.lang.IO.*;
void main() {
    int num_alunos = 1; //valor inicial
    while(num_alunos <= 4){

        IO.print("Digite o nome do " + num_alunos + "º aluno: ");
        String nome = readln();

        float soma_notas = 0;
        int notas = 1;
        while(notas <= 4){
            IO.print("Digite a " + notas + "ª nota: ");
            float nota_bimestral = Float.parseFloat(readln());
            soma_notas = soma_notas + nota_bimestral;
            notas = notas + 1;
        }
        float media = soma_notas / 4;
        num_alunos = num_alunos + 1;

        if(media >= 7){
            IO.print("Média = " + media + ", Situação = Aprovado\n");
        } else if(media < 5){
            IO.print("Média = " + media + ", Situação = Reprovado\n");
        } else {
            IO.print("Média = " + media + ", Situação = Recuperação\n");
        }
    }
}