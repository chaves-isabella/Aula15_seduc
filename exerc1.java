import static java.lang.IO.*;
void main() {
    String senha = "4321";
    String msg = "";
    for(int tentativas = 1; tentativas <= 3; tentativas++){
        IO.print("Digite uma senha: ");
        String senha_fornecida = readln();

        if(senha_fornecida.equals(senha)){
            msg = "liberado";
            break;
        } else {
            msg = "negado";
        }
    }
    IO.println("Acesso: " + msg);
    IO.print("Fim do programa!");
}