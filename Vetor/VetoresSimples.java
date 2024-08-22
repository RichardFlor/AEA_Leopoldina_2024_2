package Vetor;

public class VetoresSimples {
    public static void main(String[] args ){
        
    //Declarando vetores
       int [] vetorDeInteiros;
       String [] vetorDeStrings;
       double [] vetorDeDouble;
       boolean [] vetorDeBooleans;

    //Construindo vetores indiretamente
    vetorDeInteiros = new int[10];

    //Construindo vetores diretamente
    int [] vetorDeInteiros2 = new int[10];

    int tamanho = vetorDeInteiros.length;
    System.out.println("O tamano do vetor é: " + tamanho);

    }
    
}
//teste