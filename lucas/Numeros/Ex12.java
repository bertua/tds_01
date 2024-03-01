//Implemente um algoritmo para ordenar uma lista de números em ordem crescente
public class Ex12{
    public static void main(String[] args){
        int num1;
        int num2;
        int menor;
        for(int i = 0; i < args.length; i++){
            num1 = Integer.parseInt(args[i]);
            for(int j = i + 1; j < args.length; j++){
                num2 = Integer.parseInt(args[j]);
                if(num1 > num2){
                    menor = num2;
                    num2 = num1;
                    num1 = menor;
                    args[i] = String.valueOf(menor);
                    args[j] = String.valueOf(num2);
                }
            }
        }
        for(int k = 0; k < args.length; k++){
            System.out.print(args[k]);
            if(k < args.length -1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
