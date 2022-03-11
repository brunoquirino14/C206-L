import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int escolha=0;
        Plataforma pla = new Plataforma();
        pla.nome = "Bruno";



        System.out.println("1 -Adicionar jogo");
        escolha = sc.nextInt();
        switch (escolha){

            case 1:
                Jogo I1 = new Jogo();
                I1.nome = sc.nextLine();
                System.out.print("Escreva o nome: %s ", I1.nome);
                I1.preco = sc.nextDouble();
                System.out.print("Escreva o preco: ");

                System.out.print("Escreva o genero : ");
                I1.genero = sc.nextLine();
                System.out.print("Tem dlc ?");
                I1.dlc= sc.nextBoolean();
                pla.adicionarJogo(I1);
                break;
        }
    }
}
