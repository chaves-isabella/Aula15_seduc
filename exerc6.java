import static java.lang.IO.*;
void main() {
    println("Eleição \nVote 1 = João \nVote 2 = Maria \nOutro = Nulo");
    int cont_joao = 0;
    int cont_maria = 0;
    int cont_nulo = 0;
    for(int i = 1; i <= 10; i++){
        int opcao = Integer.parseInt(readln("Digite seu voto: "));
        if(opcao == 1){
           cont_joao += 1;
        }
        else if(opcao == 2){
            cont_maria += 1;
        }
        else{
          cont_nulo += 1;
        }
    }
    if (cont_joao > cont_maria){
        println("João venceu a eleição");
    }
    else if (cont_maria > cont_joao) {
        println("Maria venceu a eleção");
    }
    else {
        println("A maioria dos votos são nulos! Ninguém venceu a eleição");
    }
}