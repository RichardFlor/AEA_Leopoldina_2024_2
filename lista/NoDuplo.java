public class NoDuplo<T> {
   private T dado; // Dado armazenado no nó
    private NoDuplo<T> proximo; // Referência para o próximo nó da lista
    private NoDuplo<T> anterior; // Referência para o nó anterior da lista 

    public NoDuplo(T dado) {
        this.anterior = null;
        this.dado = dado;
        this.proximo = null;
    }



    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }
    
}
