import java.util.Scanner;

public class Exercicio02 {

     public static int[][] startMatriz(){
       // Declaração de Variaveis e objetos
        int linha;
        int coluna;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o numero de linhas ");
        linha = s.nextInt();
        System.out.println("Informe o numero de colunas ");
        coluna = s.nextInt();

         int[][] matriz = new int[linha][coluna];

         //estrutura de repetição para inserir os valores na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("informe o elemento da posição [%d][%d] ", i,j);
                matriz[i][j]= s.nextInt();
            }
        }

        return matriz;
    }

    //Metodo que irá imprimir os elementos da matriz
    public static void getMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t" );
            }
            System.out.println("\n");
        }
 }

 //Metodo que verifica se as matrizes sao transpostas
        public static boolean verifTransposta(int matriz[][] , int matriz1[][]){
            boolean verif = true;
            while(verif == true){
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if(matriz[i][j] == matriz[j][i]){
                            verif = true;
                            
                        }else{
                            verif = false;
                            
                        }
                }

            }
        }
return verif;
    }
    public static void main(String[] args) {
        int [][] matriz = startMatriz();
        int [][] matriz1 = startMatriz();
        getMatriz(matriz);


        getMatriz(matriz1);

        if(verifTransposta(matriz, matriz1)){
            System.out.println("é transposta");
        }else{
            System.out.println("não é transposta");
        }
    }
}
        
        


      


