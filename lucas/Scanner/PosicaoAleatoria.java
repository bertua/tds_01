import java.util.Scanner;
import java.lang.Math;
public class PosicaoAleatoria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        int aleatorio = (int)(Math.random() * nome.length());
        System.out.println(nome.charAt(aleatorio));
    }
}
