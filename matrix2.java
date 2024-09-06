import java.util.Scanner;

public class matrix2 {

    public static void main (String [] args){
        int matriz1 [][] = new int[2][2];
        int matriz2 [][] = new int[2][2];
        int matriz3 [][] = new int[2][2];

            Scanner entrada = new Scanner (System.in);
            System.out.println("Vamos Somar 3 Matrizes ;)");

            //matriz 1
            for (int linha = 0; linha < 2; linha ++)
            {
    
                for (int coluna = 0; coluna < 2; coluna ++)
                {
    
                    System.out.printf("Insira o Elemento [%d] [%d]:", linha+1,coluna+1);
                    matriz1 [linha][coluna] = entrada.nextInt();
    
                }
    
            }

            System.out.println("A Matriz 1 Ficou: \n"); 
            for (int linha = 0; linha < 2; linha ++)
            {

                for (int coluna = 0; coluna < 2; coluna ++)
                {

                  System.out.printf("\t %d \t", matriz1 [linha][coluna]);
                  
                }
                  System.out.println(""); 

            }

            //matriz 2
            for (int linha = 0; linha < 2; linha ++)
            {
    
                for (int coluna = 0; coluna < 2; coluna ++)
                {
    
                    System.out.printf("Insira o Elemento [%d] [%d]:", linha+1,coluna+1);
                    matriz2 [linha][coluna] = entrada.nextInt();
    
                }
    
            }

            System.out.println("A Matriz 2 Ficou: \n"); 
            for (int linha = 0; linha < 2; linha ++)
            {

                for (int coluna = 0; coluna < 2; coluna ++)
                {

                  System.out.printf("\t %d \t", matriz2 [linha][coluna]);
                  
                }
                 System.out.println(""); 

            }

            //matriz3
            for (int linha = 0; linha < 2; linha ++)
            {
    
                for (int coluna = 0; coluna < 2; coluna ++)
                {
    
                    matriz3 [linha][coluna] = matriz1 [linha][coluna] + matriz2 [linha][coluna];
    
                }
    
            }

            System.out.println("A Matriz 3 Ficou: \n"); 
            for (int linha = 0; linha < 2; linha ++)
            {

                for (int coluna = 0; coluna < 2; coluna ++)
                {

                  System.out.printf("\t %d \t", matriz3 [linha][coluna]);
                  
                }
                 System.out.println(""); 

            }

            //soma diagonal
            int soma = 0;
            for(int i = 0; i < 2; i++) {
            soma += matriz3[i][i];
            }
            System.out.println("Soma da Diagonal: " + soma);

    }

}
