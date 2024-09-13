package Lista;

public class ListaEncadeadaTeste {

    public static void main(String[] args){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);

        System.out.println(lista);
    }
    
}
