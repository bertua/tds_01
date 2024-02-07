public class Intercalar{
    public static void main(String[] args){
        int i = 0;
        while(i < args.length){
            if(i < args.length - 1){
                System.out.print(args[i] + "-");
                i++;
            }
            else {
                System.out.print(args[i]);
                i++;
            }
        }
        System.out.println();
    }
}
