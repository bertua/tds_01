import java.util.Scanner;
public class PosicaoEspecifica{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        int posicao = input.nextInt();
        System.out.println(nome.charAt(posicao));
    }
}
