package Lista;
public class ListaEncadeada<T>{

    private No<T> head;
    private No<T> ultimo;

    public void adicionar(T dado){

        No<T> no = new No<T>(dado);
        
        if (this.head == null) {
            this.head = no;
            this.ultimo = no;
        }else{
            this.ultimo.setProximo(no);
            this.ultimo = no;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = head;
        while(atual != null){
        sb.append(atual.getDado()).append(" -> ");
        atual = atual.getProximo();
         
    }
    return sb.toString();

}

    
}