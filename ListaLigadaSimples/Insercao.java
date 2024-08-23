package ListaLigadaSimples;

public class Insercao {
    
    No head;

    void insertAtBeginning(int data){
        
        //Criando um novo nó como o valor que vai ser fornecido para ele.
        No newNode = new No(data);
        newNode.next = head;
        head = newNode;
    } 
    void insertAtEnd(int data){
        No newNode = new No(data);
        
        if (head == null){
            head = newNode;
        }else{
            No temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
