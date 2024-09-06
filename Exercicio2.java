import java.util.Scanner;

public class Exercicio2 {

public static final int QUANTIDADE_DE_PESSOAS = 3;

    public static void main(String[] args) {

        int i; 
        String nome;  
        Pessoa[] pessoas = new Pessoa[QUANTIDADE_DE_PESSOAS];
        Scanner leitor = new Scanner(System.in);

            for(i=0; (i < QUANTIDADE_DE_PESSOAS); i++){
                System.out.println("Informe o nome da Pessoa" + (i+1));
                pessoas[i] = new Pessoa();
                pessoas[i].nome = leitor.next();  
                }

                System.out.println("Digite um Nome Aleatório");
                String nomealeatorio = leitor.next();

            for(Pessoa p : pessoas) {
                if(p.nome.equals(nomealeatorio)) {
                System.out.println("ACHEI1");
                return;
            }
        }
        
        System.out.println("não achei");
}

    static class Pessoa {
    String nome;

}

}