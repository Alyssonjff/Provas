import java.util.Scanner;

public class questao_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase");
        String frase = sc.nextLine();
        System.out.println("Digite o parametro");
        String parametro = sc.nextLine();
        if (frase.contains(parametro)){
            System.out.println("Existe");
        }else{
            System.out.println("Não existe");
        }
    }
}
