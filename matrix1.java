

import java.util.Scanner;

public class matrix1 {

    public static void main (String [] args){

        int[][] matriz = new int[3][3];
        Scanner entrada = new Scanner (System.in);

        System.out.println("Matriz M [3][3] \n");
        for (int linha = 0; linha < 3; linha ++)
        {

            for (int coluna = 0; coluna < 3; coluna ++)
            {

                System.out.printf("Insira o Elemento [%d] [%d]:", linha+1,coluna+1);
                matriz [linha][coluna] = entrada.nextInt();

            }

        }

        System.out.println("A Matriz Ficou: \n"); 
            for (int linha = 0; linha < 3; linha ++)
            {

                for (int coluna = 0; coluna < 3; coluna ++)
                {

                  System.out.printf("\t %d \t", matriz [linha][coluna]);
                  
                }
                 System.out.println(); 

            }
            
    }

}
