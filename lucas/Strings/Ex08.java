public class Ex08 {
    public static void main(String[] args){
        String snake_case = "";
        for(int i = 0; i < args.length; i++){
            snake_case = args[i].toLowerCase();
            System.out.print(snake_case);
            if(i < args.length -1){
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
