public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> head; // Primeiro nó da lista
    private NoDuplo<T> ultimo; // Último nó da lista
    private int tamanho; // Tamanho da lista, ou seja, a quantidade de nós

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tamanho = 0;
        this.ultimo = null;
    }
      // Método para adicionar um elemento ao final da lista
      public void adicionar(T dado) {

        NoDuplo<T> novoNo = new NoDuplo<T>(dado); // Cria um novo nó com o dado fornecido

           // Verifica se a lista está vazia
           if (head == null) {
             // Se estiver vazia, o novo nó será tanto o head quanto o ultimo
             head = novoNo;
             ultimo = novoNo;
        
        }else{
                        // Caso contrário, o último nó da lista aponta para o novo nó
            ultimo.setProximo(novoNo); 
            novoNo.setAnterior(ultimo);  // O novo nó aponta o anterior para o último
            ultimo = novoNo; // Atualiza a referência do último nó

        }
        tamanho++; // Incrementa o tamanho da lista
      }

      // Método para remover o último nó da lista
    public void remover() {
        // Verifica se a lista está vazia
        if (ultimo == null) {
            System.out.println("A lista está vazia.");
        }
         // Caso só haja um nó, a lista ficará vazia após a remoção
         if (head == ultimo) {
            head = null;
            ultimo = null;
    
    }else{
 // Se houver mais de um nó, atualiza o último para o anterior do atual
 ultimo = ultimo.getAnterior();
 ultimo.setProximo(null); // Remove a referência ao antigo último


    }

    tamanho--; // Decrementa o tamanho da lista

    }
    
   // Método para imprimir a lista do início (head) ao final (ultimo)
   public void imprimir() {
    NoDuplo<T> atual = head; // Começa no primeiro nó
    while (atual != null) { // Percorre até encontrar o final da lista
        System.out.print(atual.getDado() + " <-> "); // Imprime o dado do nó atual
        atual = atual.getProximo(); // Avança para o próximo nó
    }
    System.out.println("null"); // Indica o fim da lista
}

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
