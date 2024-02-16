public class Ex10 {
    public static void main(String[] args){
        String camelCase = "";
        System.out.print(args[0]);
        for(int i = 1; i < args.length; i++){
            camelCase = args[i].substring(0,1).toUpperCase() + args[i].substring(1);
            System.out.print(camelCase);
        }
        System.out.println();
    }
}
