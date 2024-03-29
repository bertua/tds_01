import java.util.Scanner;
public class Pizzaria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a pizzaria!");

        Pedido pedido = new Pedido();
        
        String continuar;

        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pizza: ");
            item.setTipo(input.nextLine().trim());

            System.out.print("Informe o sabor de pizza: ");
            item.setSabor(input.nextLine().trim());

            pedido.addItem(item);
            
            pedido.setTotal(item.getValor());

            System.out.println("> mais alguma coisa?");
            continuar = input.nextLine().trim();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(input.nextLine().trim());

        System.out.print("Bairro: ");
        pedido.setBairro(input.nextLine().trim());
        pedido.setTaxaDeEntrega(pedido.getBairro());

        pedido.setTotal(pedido.getTaxaDeEntrega());

        pedido.imprimir();
    }
}
