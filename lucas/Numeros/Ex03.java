//Escreva um programa para verificar se os números são pares ou ímpares
public class Ex03{
    public static void main(String[] args){
        int numero;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            if(numero % 2 == 0){
                System.out.println(numero + " Par");
            } else {
                System.out.println(numero + " Ímpar");
            }
        }
    }
}
