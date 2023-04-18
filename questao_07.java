import java.util.Scanner;

public class questao_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{1, 2}, {3, 4}};
        if (matriz.length == 2) {
            int diagonalPrin = 1;
            int diagonalSecu = 1;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j) {
                        diagonalPrin *= matriz[i][j];
                    }
                    if (i + j == matriz[i].length - 1) {
                        diagonalSecu *= matriz[i][j];
                    }

                }
            }
            System.out.println("A determinante é " + (diagonalPrin - diagonalSecu));
        }else{
            System.out.println("Não é valida");
        }
    }
}
