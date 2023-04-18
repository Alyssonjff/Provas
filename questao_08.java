import java.util.Scanner;

public class questao_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas Palavras serão concatenadas?");
        int x = sc.nextInt();
        String[] lista = new String[x];
        sc.nextLine();
        String nada = "";
        for (int i = 0;i < lista.length;i++){
            System.out.println("Digite a palavra");
            lista[i] = sc.nextLine();
            nada = nada.concat(lista[i]);
        }
        System.out.println(nada);
    }
}
