//Escreva um programa para calcular o fatorial dos números digitados
public class Ex05{
    public static void main(String[] args){
        int numero;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            int fatorial = 1;
            for(int j = 0 ; j < numero; j++){
                fatorial *= numero - j;
            }
            System.out.println(fatorial);
        }
    }
}
