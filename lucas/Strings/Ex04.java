//Ler uma palavra e imprima-a de trás-para-frente
public class Ex04 {
    public static void main(String[] args){
        String inverter = "";
        for(int i = args[0].length() -1; i >= 0 ; i--){
            inverter += args[0].charAt(i);
        }
        System.out.println(inverter);
    }
}


/*
public class Ex04 {
    public static void main(String[] args){
        String inverter = "";
        for(int i = 0; i < args[0].length(); i++){
            inverter = args[0].charAt(i) + inverter;
        }
        System.out.println(inverter);
    }
}
*/
