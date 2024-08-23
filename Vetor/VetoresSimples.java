package Vetor;

public class VetoresSimples {
    public static void main(String[] args ){
        
    // //Declarando vetores
    //    int [] vetorDeInteiros;
    //    String [] vetorDeStrings;
    //    double [] vetorDeDouble;
    //    boolean [] vetorDeBooleans;

    // //Construindo vetores indiretamente
    // vetorDeInteiros = new int[10];

    // //Construindo vetores diretamente
    // int [] vetorDeInteiros2 = new int[10];

    // int tamanho = vetorDeInteiros.length;
    // System.out.println("O tamano do vetor é: " + tamanho);

        int[] numeros;
        double[] precos;
        char[] vogais;
        String[] frutas;

        numeros = new int [5];
        frutas = new String[3];
        precos = new double[4];
        vogais = new char[5];

        //Inicializando o vetor de inteiros
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        frutas[0] = "Uva";
        frutas[1] = "Manga";
        frutas[2] = "Caqui";
        
        vogais[0] = 'A';
        vogais[1] = 'I';
        vogais[2] = 'U';
        vogais[3] = 'E';
        vogais[4] = 'O';

        precos[0]= 1.1;
        precos[1]= 2.1;
        precos[2]= 3.1;
        precos[3]= 4.1;


       int TamanhoNumeros = numeros.length;
       System.out.println("Tamanho do vetor: " + TamanhoNumeros);

       int TamanhoFrutas = frutas.length;
       System.out.println("Tamanho do vetor: " + TamanhoFrutas);

       int TamanhoPrecos = precos.length;
       System.out.println("Tamanho do vetor: " + TamanhoPrecos);

       int TamanhoVogais = vogais.length;
       System.out.println("Tamanho do vetor: " + TamanhoVogais);
        

       for(int i = 0; i < numeros.length; i++){
        System.out.println("Elemento no indice " + i + ": "+ numeros[i]);
       }   

       for(int i = 0; i < frutas.length; i++){
        System.out.println("Elemento no indice " + i + ": "+ frutas[i]);
       }   

       for(int i = 0; i < vogais.length; i++){
        System.out.println("Elemento no indice " + i + ": "+ vogais[i]);
       }   

       for(int i = 0; i < precos.length; i++){
        System.out.println("Elemento no indice " + i + ": "+ precos[i]);
       }   


       int [] numeros2 = new int[10];
       for(int i = 0; i < numeros2.length; i++){
        numeros2[i] = (i+1) * 10;
        
        System.out.println("Elemento no indice " + i + ": "+ numeros2[i]);
        }

    }
    
}
