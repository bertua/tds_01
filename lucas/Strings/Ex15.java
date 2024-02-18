public class Ex15 {
    public static void main(String[] args){
        String inverter = "";
        for(int i = args.length -1; i >= 0; i--){
            for(int j = 0; j < args[i].length(); j++){
                inverter = args[i].charAt(j) + inverter;
            }
            System.out.print(inverter);
            if(i > 0){
                System.out.print(" ");
            }
            inverter = "";
        }
        System.out.println();
    }
}
