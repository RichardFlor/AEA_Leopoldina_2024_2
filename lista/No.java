// Definição de uma classe genérica chamada No (Nó) que pode armazenar qualquer tipo de dado
public class No<T> {

    // Atributo privado que armazena o dado de tipo genérico T
    private T dado;

    // Atributo privado que aponta para o próximo nó da lista encadeada
    private No<T> proximo;

    // Construtor que inicializa o nó com o dado fornecido e o próximo nó como null
    public No(T dado) {
        this.dado = dado;
        // Quando este construtor é usado, o próximo nó não é definido (permanece null)
    }

    // Construtor que inicializa o nó com o dado e uma referência ao próximo nó
    public No(T dado, No<T> proximo) {
        this.dado = dado;       // Inicializa o atributo dado
        this.proximo = proximo; // Define o próximo nó
    }

    // Método getter que retorna o valor armazenado no atributo dado
    public T getDado() {
        return dado;  // Retorna o dado deste nó
    }

    // Método setter que permite modificar o valor do atributo dado
    public void setDado(T dado) {
        this.dado = dado;  // Atribui um novo valor ao dado deste nó
    }

    // Método getter que retorna o próximo nó na sequência
    public No<T> getProximo() {
        return proximo;  // Retorna a referência ao próximo nó
    }

    // Método setter que permite modificar a referência ao próximo nó
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;  // Atribui um novo nó como próximo na sequência
    }

    // Sobrescreve o método toString para representar o nó como uma string
    @Override
    public String toString() {
        // StringBuilder é usado para construir a string de forma eficiente
        StringBuilder sb = new StringBuilder();

        // Adiciona o valor do dado e a referência ao próximo nó à string
        sb.append("dado=").append(dado).append(", proximo=").append(proximo).append("");

        // Retorna a string completa representando este nó
        return sb.toString();
    }

}
