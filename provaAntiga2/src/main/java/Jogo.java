import java.util.Arrays;
import java.util.Scanner;
public class Jogo {
    String nome;
    String genero;
    Double preco;
    boolean dlc;
    Jogo jogos[];

    void mostraInf(){
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                System.out.println("Posicao: " + i);
                System.out.println("Nome: " + nome);
                System.out.println("Preco: " + preco);
                System.out.println("Genero: " + genero);
                System.out.println("Possui DLC?: " + dlc);
            }

        }
    }

}
