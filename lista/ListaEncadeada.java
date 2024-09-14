public class ListaEncadeada<T> {

    private No<T> head;
    private No<T> ultimo;

    // Método para adicionar um novo elemento à lista
    public void adicionar(T dado) {
        No<T> no = new No<>(dado);
        
        if (this.head == null) {
            this.head = no;
            this.ultimo = no;
        } else {
            this.ultimo.setProximo(no);
            this.ultimo = no;
        }
    }

    // Método para remover o primeiro nó com o valor especificado
    public boolean remover(T dado) {
        if (head == null) {
            // Lista está vazia, não há nada para remover
            return false;
        }

        // Caso especial: remover o nó que está no início da lista (head)
        if (head.getDado().equals(dado)) {
            head = head.getProximo();
            // Se a lista ficar vazia após a remoção, também atualizar o último nó
            if (head == null) {
                ultimo = null;
            }
            return true;
        }

        // Percorre a lista para encontrar o nó a ser removido
        No<T> atual = head;
        while (atual.getProximo() != null) {
            if (atual.getProximo().getDado().equals(dado)) {
                // Nó a ser removido encontrado
                if (atual.getProximo() == ultimo) {
                    // Se o nó a ser removido é o último, atualiza o último nó
                    ultimo = atual;
                }
                // Remove o nó ajustando o ponteiro do nó atual
                atual.setProximo(atual.getProximo().getProximo());
                return true;
            }
            atual = atual.getProximo();
        }

        // Nó com o dado especificado não foi encontrado
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = head;
        while (atual != null) {
            sb.append(atual.getDado()).append("->");
            atual = atual.getProximo();
        }
        return sb.toString();
    }
}
    