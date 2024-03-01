//Escreva um algoritmo que leia n temperaturas e converta-as de Celsius para Fahrenheit
public class Ex11{
    public static void main(String[] args){
        double celsius;
        double fahrenheit;
        for(int i = 0; i < args.length; i++){
            celsius = Double.parseDouble(args[i]);
            fahrenheit = celsius * 1.8 + 32;
            System.out.println(celsius + "° celsius em fahrenheit: " + fahrenheit + "°");
        }
    }
}
