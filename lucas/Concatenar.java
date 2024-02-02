import java.util.Scanner;
public class Concatenar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String frase = "Tem uma frase com ";
        String nome = input.nextLine();
        System.out.println(frase + nome);
    }
}
