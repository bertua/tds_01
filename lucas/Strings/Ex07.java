public class Ex07 {
    public static void main(String[] args){
        String title = "";
        for(int i = 0; i < args.length; i++){
            title = args[i].substring(0,1).toUpperCase() + args[i].substring(1);
            System.out.print(title);
            if(i < args.length -1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
