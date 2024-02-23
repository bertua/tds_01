//Crie um programa para verificar se os números informados são primos ou não
public class Ex06{
    public static void main(String[] args){
        int numero;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);

            if(numero < 2){
                System.out.println("Não é primo");
            } else {
                for(int j = 2; j <= numero; j++){
                    if(numero % j == 0 && j != numero){
                        System.out.println("Não é primo");
                        break;
                    } else {
                        System.out.println("É primo");
                        break;
                    }
                }
            }
        }
    }
}
