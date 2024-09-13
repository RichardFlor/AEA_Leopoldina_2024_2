package Lista;

//T indica que é um tipo generico
public class No <T>{

    private T dado;
    private No<T> proximo;

    

    public No(T dado) {
        this.dado = dado;
    }

    

    public No(T dado, No<T> proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }



    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dado =").append(dado).append("proximo").append(proximo).append("");
        return sb.toString();
    }
    
    
}
