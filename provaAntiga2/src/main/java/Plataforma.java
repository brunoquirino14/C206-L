import java.sql.SQLOutput;
public class Plataforma {
    String nome;
    String criador;
    Jogo jogos[];

    public Plataforma(){
        jogos = new Jogo[10];
    }

    public void calculaDlc(){

    }
    public void mostraInfo(){

    }
    void adicionarJogo(Jogo jogo){
        boolean  flag = true;
        for (int i = 0;i< jogos.length;i++){
            if(jogos[i] == null && flag){
                jogos[i] = jogo;
                flag = false;
                System.out.println("Carta adicionada");
            }
            if (flag)
                System.out.println("Sem espaco no deck");
        }
    }
    public void mostraMaisBaratoMaisCaro(){

    }



}
