public class Ex14 {
    public static void main(String[] args){
        String vogais = "AEIOUaeiou";
        String semVogal = "";
        char ch;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                int contagem = 0;
                ch = args[i].charAt(j);
                for(int k = 0; k < vogais.length(); k++){
                    if(ch == vogais.charAt(k)){
                        contagem++;
                    }
                }
                if(contagem == 0){
                    semVogal += ch;
                } 
            }
            System.out.print(semVogal);
            if(i < args.length-1){
                System.out.print(" ");
            }
            semVogal = "";
        }
        System.out.println();
    }
}