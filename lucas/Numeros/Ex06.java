//Crie um programa para verificar se os números informados são primos ou não
public class Ex06{
    public static void main(String[] args){
        int numero;
        int check;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);

            if(numero < 2){
                System.out.println("Não é primo");
            }
            check = 0;
            for(int j = 2; j < numero; j++){
                if(numero % j == 0){
                    System.out.println("Não é primo");
                    check++;
                    break;
                }
            }
            if(check == 0){
                System.out.println("É primo");
            }

        }
    }
}
