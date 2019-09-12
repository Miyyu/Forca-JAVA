package forca;

import java.util.Scanner;
        
public class Jogo {
 
    String palavra;
    char[] palavraVetor;
    char[] palavratoArray;
    int tamanho;
    Contador cont;

    public Jogo() {
        palavra = "ABACAXI";
        palavraVetor = new char[palavra.length()];
        palavratoArray = palavra.toCharArray();  //Converte a String por um Array
        tamanho = 0;

        cont = new Contador();
    }
    
        
    private void preencherVetor(){
        for(int i = 0; i < palavra.length(); i++){
             palavraVetor[i] = '_';
        }
    }
 
    private char pegarLetra(){
        System.out.print(" Digite uma letra: ");
           
        Scanner scan = new Scanner(System.in);
        char letra = scan.next().charAt(0);    //Pegar somente um indice, representando uma unica letra
        
        letra = Character.toUpperCase(letra);    // Transformar toda char em maíuscula
        
        return letra;
    }

    private boolean validarLetra(char letra){
        boolean contem = true;
        
        for(int i = 0; i < palavra.length(); i++){
            if(letra == palavratoArray[i]){
                 atualizarPalavra(letra, i);
                 if(this.tamanho == palavra.length()){
                     cont.vencer(palavra);
                     return false;
                 }
             contem = false;
             }
        }
        if(contem == true){
            
            boolean a = cont.exibirForca();
            return a;
        }
        return true;
    }
  
    private void atualizarPalavra(char letra, int i){
        boolean estaDentro;
        if(palavraVetor[i] == letra){   // Verifica se a letra já foi colocada antes
            estaDentro = true;
        }
        else{
            palavraVetor[i] = letra;
            this.tamanho += 1;
            estaDentro = false;
        }
        
    }
    
    public void jogar(){
        preencherVetor();
        boolean rodar = true;
 
        while(rodar != false){
            for(int i = 0; i < palavra.length(); i++){
                System.out.print(palavraVetor[i]+" ");   // exibir a palavra com espaços entre os traços
            }

            char letra = pegarLetra();
            rodar = validarLetra(letra);
     
        }   
    }
}