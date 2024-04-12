import java.util.Scanner;
public class Pizzaria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a pizzaria!");
        System.out.println("Selecione:");
        System.out.println("1.Pedido");
        System.out.println("2.Imprimir histórico");
        System.out.println("#.Sair");
        String menu = input.nextLine();
        Faturamento faturamento = new Faturamento();

        while(true){
            if(menu.equals("#")){
                break;
            }

            switch(menu){
                case "1":
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

                    faturamento.setBoleto(pedido);
                    faturamento.addPedido(pedido);
                    faturamento.setTotalMotoboy(pedido.getTaxaDeEntrega());
                    faturamento.setTotalGeral(pedido.getTotal());
                    faturamento.setTotalLiquido();

                    break;

                case "2":
                    faturamento.imprimirHistorico();
                    break;
            }
            System.out.println("Selecione:");
            System.out.println("1.Pedido");
            System.out.println("2.Imprimir histórico");
            System.out.println("#.Sair");
            menu = input.nextLine();
        }
        input.close();
    }
}
