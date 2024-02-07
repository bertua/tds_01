public class IntercalarInv{
    public static void main(String[] args){
        int i = args.length - 1;
        while(i >= 0){
            if(i > 0){
                System.out.print(args[i] + "-");
                i--;
            }
            else {
                System.out.print(args[i]);
                i--;
            }
        }
        System.out.println();
    }
}
