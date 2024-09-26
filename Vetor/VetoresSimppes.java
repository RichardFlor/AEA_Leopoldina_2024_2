package Vetor;
public class VetoresSimppes {
    public static void main(String[] args) {


    int[] numeros;
    String[] frutas;
    double[] precos;
    char[] vogais;

    numeros = new int[5];
    frutas = new String[3];
    precos = new double[4];
    vogais = new char[5];
// Inicializando o vetor de inteiros
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
numeros[3] = 40;
numeros[4] = 50;


// Inicializando o vetor de double
precos[0] = 19.99;
precos[1] = 25.50;
precos[2] = 9.75;
precos[3] = 30.00;

// Inicializando o vetor de caracteres
vogais[0] = 'A';
vogais[1] = 'E';
vogais[2] = 'I';
vogais[3] = 'O';
vogais[4] = 'U';


// Acessando o tamanho do vetor de inteiros
int tamanhoNumeros = numeros.length;
System.out.println("Tamanho do vetor numeros: " + tamanhoNumeros);

// Acessando o tamanho do vetor de Strings
int tamanhoFrutas = frutas.length;
System.out.println("Tamanho do vetor frutas: " + tamanhoFrutas);

// Acessando o tamanho do vetor de double
int tamanhoPrecos = precos.length;
System.out.println("Tamanho do vetor precos: " + tamanhoPrecos);

// Acessando o tamanho do vetor de caracteres
int tamanhoVogais = vogais.length;
System.out.println("Tamanho do vetor vogais: " + tamanhoVogais);

for(int i = 0;  i < numeros.length; i++){
    System.out.println("Elemento no índice " + i + ": " + numeros[i]);
}

int [] numeros2 = new int[10];

for(int i = 0; i < numeros2.length; i++ ){
    numeros2[i] = (i+1) * 10;
}

for(int i = 0;  i < numeros2.length; i++){
    System.out.println("Elemento no índice " + i + ": " + numeros[i]);
}
  
}
 
    }
    

