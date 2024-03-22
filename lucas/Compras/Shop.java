import java.util.Scanner;
import java.time.LocalDate;
public class Shop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();

        pedido.setCliente(usuario);
        pedido.setProduto(produto);

        LocalDate data = LocalDate.now();
        pedido.setData(data);

        System.out.println("Login");

        System.out.print("Nome: ");
        usuario.setNome(input.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(input.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(input.nextLine());
        System.out.println();

        String continuar;
        do{
            System.out.print("Produto: ");
            produto.setNomeP(input.nextLine());

            System.out.print("Preço: ");
            produto.setPreco(input.nextDouble());
            input.nextLine();

            System.out.print("Descricao: ");
            produto.setDescricao(input.nextLine());


            pedido.setProdutoEPreco(produto.getNomeP(), produto.getPreco());
            pedido.setTotal(produto.getPreco());

            System.out.println("> continuar à comprar?");
            continuar = input.nextLine();
            System.out.println();

        } while(!continuar.equalsIgnoreCase(""));


        



    }
}
