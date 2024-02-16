public class Ex11 {
    public static void main(String[] args){
        String PascalCase = "";
        for(int i = 0; i < args.length; i++){
            PascalCase = args[i].substring(0,1).toUpperCase() + args[i].substring(1);
            System.out.print(PascalCase);
        }
        System.out.println();
    }
}
