//Crie um programa para verificar se os números informados são primos ou não
public class Ex06{
    public static void main(String[] args){
        int numero;
        int check;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            check = 0;
            if(numero < 2){
                System.out.println(args[i] + " Não é primo");
            } else {
                for(int j = 2; j <= Math.sqrt(numero); j++){
                    if(numero % j == 0){
                        System.out.println(args[i] + " Não é primo");
                        check++;
                        break;
                    }
                }
                if (check == 0){
                    System.out.println(args[i] + " É primo");
                }
            }
        }
    }
}
