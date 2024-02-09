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
        System.out.println();

        for(int j = args.length - 1; j >= 0; j--){
            if(j > 0){
                System.out.print(args[j] + "-");
            }
            else {
                System.out.print(args[j]);
            }
        }
        System.out.println();
        System.out.println();

         for(int k = args.length -1; k >= 0; k--){
            System.out.print(args[k]);
            if(k > 0){
                System.out.print("-");
            }
        }
        System.out.println();
        System.out.println();

        String a = "";
        for(int l = args.length -1; l >= 0; l--){
            System.out.print(a + args[l]);
            a = "-";
        }
        System.out.println();
    }
}
