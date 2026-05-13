import static java.lang.IO.*;
void main() {
    int multiplos = 0;
    println("Múltiplos de 3 encontrados: ");
    for(int i = 3; i <= 100; i++){
        if(i % 3 == 0){
            println(i + " ");
            multiplos = multiplos + i;
        }

    }
}