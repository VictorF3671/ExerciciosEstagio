import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma palavra");

        String palavra = s.nextLine();
    
    imprimeAnagramas("" ,palavra);
    System.out.println("O numero de Anagramas possiveis : " +numAnagramas(palavra));

}

//Metodo que irá calcular a quantidade de anagramas da palavra
  public static int numAnagramas(String palavra){
    
   int tamanho = palavra.length();
    
   int fatorial = tamanho;

   while (tamanho > 1) {
       fatorial = fatorial * (tamanho - 1);
       tamanho--;
       
   }
        
        return fatorial;
  }

//Método que irá imprimir todos os anagramas possiveis da palavra inserida
public static void imprimeAnagramas(String prefixo, String palavra) {
    if (palavra.length() <= 1) {
        System.out.println(prefixo + palavra);
    } else {
        for (int i = 0; i < palavra.length(); i++) {
            String ini = palavra.substring(i, i + 1);
            String ant = palavra.substring(0, i); 
            String dep = palavra.substring(i + 1); 
            imprimeAnagramas(prefixo + ini, ant + dep);
        }
    }
}

}
