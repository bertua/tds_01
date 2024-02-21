//Escreva um programa para calcular a raiz quadrada dos números dados
import java.lang.Math;
public class Ex07{
    public static void main(String[] args){
        double raiz;
        int numero;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            raiz = Math.sqrt(numero);
            System.out.println(raiz);
        }
    }
}
