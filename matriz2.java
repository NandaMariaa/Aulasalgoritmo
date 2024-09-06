import java.util.*;
public class matriz2 {

    public static void main(String[] args) {

        int matriz1 [][] = new int[2][4];
        Scanner entrada = new Scanner (System.in);
            System.out.println("Vamos Somar 3 Matrizes ;)");

            //matriz 1
            for (int linha = 0; linha < 2; linha ++)
            {
    
                for (int coluna = 0; coluna < 4; coluna ++)
                {
    
                    System.out.printf("Insira o Elemento [%d] [%d]:", linha+1,coluna+1);
                    matriz1 [linha][coluna] = entrada.nextInt();
    
                }
    
            }

            System.out.println("A Matriz 1 Ficou: \n"); 
            for (int linha = 0; linha < 2; linha ++)
            {

                for (int coluna = 0; coluna < 4; coluna ++)
                {

                  System.out.printf("\t %d \t", matriz1 [linha][coluna]);
                  
                }
                  System.out.println(""); 

            }






       
    }

    
}
