import java.util.Scanner;
public class PosicaoEspecifica{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String posicao = args[0];
        int posicaoInt = Integer.parseInt(posicao);
        System.out.println(nome.charAt(posicaoInt));
    }
}
