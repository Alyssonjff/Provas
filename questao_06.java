import java.util.Scanner;

public class questao_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual palavra");
        String palavra = sc.nextLine();
        for (int i = palavra.length() - 1;i >= 0;i--){
            System.out.print(palavra.charAt(i));
        }

    }
}
