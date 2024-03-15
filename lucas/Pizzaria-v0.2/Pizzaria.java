import java.util.Scanner;
public class Pizzaria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a pizzaria:");

        Pedido pedido = new Pedido();
        
        String continuar;

        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pizza: ");
            item.setTipo(input.nextLine());

            System.out.print("Informe o sabor de pizza: ");
            item.setSabor(input.nextLine());

            System.out.print("Informe o valor de pizza: ");
            item.setValor(input.nextDouble());
            input.nextLine();

            pedido.adicionarItem(item);

            System.out.println("> mais alguma coisa?");
            continuar = input.nextLine();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(input.nextLine());

        System.out.print("Taxa de entrega: ");
        pedido.setTaxaDeEntrega(input.nextDouble());

        pedido.imprimir();
    }
}
