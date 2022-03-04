public class Funcionario {
    int idade;
    String cpf;
    String nome;
    double salario;

    void tirarFerias(String mes){
        System.out.println("Funcionario" + nome + "vai tirar férias em" + mes);
    }

    double calculaSalarioAnual(){
        return 12*salario;
    }
}
