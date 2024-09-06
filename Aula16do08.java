import java.util.Scanner;


public class Aula16do08 {
public static void main (String [] args){

 double[] nota = new double[5];
 double soma = 0.0, media;
 int i ;
 int TAM = 5;
 media = soma/5 ;

 Scanner leitor = new Scanner(System.in);
 System.out.println( "Digite os valores das cinco notas:" ) ;
    for (i = 0 ; i < TAM ; i ++ ){
    nota [i]= leitor.nextDouble();
    soma = soma + nota [i];
    }
 System.out.println("Média das notas: " + media ) ;

 leitor.close();

}



}