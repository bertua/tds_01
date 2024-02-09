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
        System.out.println();

        for(int j = 0; j < args.length; j++){
            if(j < args.length - 1){
                System.out.print(args[j] + "-");
            }
            else {
                System.out.print(args[j]);
            }
        }
        System.out.println();
        System.out.println();

        for(int k = 0; k < args.length; k++){
            System.out.print(args[k]);
            if(k < args.length -1){
                System.out.print("-");
            }

        }
        System.out.println();
        System.out.println();

        String a = "";
        for(int l = 0; l < args.length; l++){
            System.out.print(a + args[l]);
            a = "-";
        }
        System.out.println();
    }
}
