public class Ex16{
    public static void main(String[] args){
        char ch;
        for(int i = 0; i < args.length; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                if(isVowel(ch)){
                    System.out.print(args[i].indexOf(ch) + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isVowel(char letra){
        String vogais = "aeiouAEIOU";
        for(int i = 0; i < vogais.length(); i++){
            if(letra == vogais.charAt(i)){
                return true;
            }
        }
        return false;

    }

}
