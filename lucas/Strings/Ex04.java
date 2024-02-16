public class Ex04 {
    public static void main(String[] args){
        String inverter = "";
        for(int i = 0; i < args[0].length(); i++){
            inverter = args[0].charAt(i) + inverter;
        }
        System.out.println(inverter);
    }
}
