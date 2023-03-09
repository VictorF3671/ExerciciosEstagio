import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        //declaração das variáveis
        int a = 1;
        int b = 0;
        int aux;
        int num;
        //Variável de "leitura" 
        Scanner s = new Scanner(System.in);

        //Usuario irá entrar com um numero
        System.out.println("Exercicio Fibonacci");
        System.out.print("Digite um número \n ->");
        num = s.nextInt();


        System.out.println();

        
            while(a<num){
            System.out.print(a +" - ");
            aux = a;
            a = a + b;
            b = aux;
        }


        
    }
}
