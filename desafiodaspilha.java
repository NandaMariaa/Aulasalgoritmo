import java.util.Objects;

public class desafiodaspilha {

    static Object pilha[] = new String[5];
    static int pos = 0;

    public static void main(String args[]) {
        System.out.println("\nPrimeiro Carro Entra (Nivus)");
        push("Nivus");
        System.out.println("\nSegundo Carro (Cronoss)");
        push("Cronoss");
        System.out.println("\nTerceiro Carro (Chevrolet)");
        push("Chevrolet");

        System.out.println("\n\nTamanho da Fila:" + size());
        System.out.println("\nSaindo da Fila: " + pop());
        System.out.println("\nSaindo da Fila: " + pop());
        System.out.println("\nSaindo da Fila: " + pop());
        System.out.println("\n\nTamanho da pilha " + size());
    }

    static void push(Object valor) {
        pilha[pos] = valor;
        /*
         * Empilha um novo elemento no topo da pilha.
         * Repare que não é verificada a capacidade máxima da pilha.
         */
        pos++; // Atualiza o topo da pilha
    }

    static Object pop() {
        /*
         * Retorna
         * o elemento do topo da ilha
         * .
         * Não
         * é verificado
         * o final da pilha
         * .
         */
        return (pilha[--pos]);
    }

    static int size() {
        return pos; /*
                     * retorna
                     * o topo da pilha
                     */
    }

}

    

