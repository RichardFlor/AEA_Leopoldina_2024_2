package ListaLigadaSimples;

public class Remocao {

    No head; 
    void deleteNode(int key){
        No temp = head, prev = null;
        
        if( temp != null && temp.data == key){
            head = temp.next;
        }
        
        while (temp != null && temp.data != key){
            prev = temp;
            temp= temp.next;
            prev.next = temp.next;
        }
    }
}
