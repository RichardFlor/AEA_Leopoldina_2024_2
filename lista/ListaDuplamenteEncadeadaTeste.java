public class ListaDuplamenteEncadeadaTeste {
    public static void main(String[] args) {
        // Instancia uma nova lista duplamente encadeada de inteiros
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        
        // Adiciona elementos à lista
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        // Imprime a lista do início ao fim
        System.out.println("Lista na ordem normal:");
        lista.imprimir(); // Saída: 1 <-> 2 <-> 3 <-> null

        

        // Remove o último elemento da lista
        System.out.println("Removendo o último elemento...");
        lista.remover();

        // Imprime a lista novamente após a remoção
        System.out.println("Lista após a remoção:");
        lista.imprimir(); // Saída: 1 <-> 2 <-> null

        // Imprime o tamanho atual da lista
        System.out.println("Tamanho da lista: " + lista.getTamanho());  // Saída: Tamanho: 2
    }
}


