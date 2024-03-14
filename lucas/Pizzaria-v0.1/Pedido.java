public class Pedido{
    private double taxaEntrega;
    private ItemDoPedido itemDoPedido;
    private String cliente;

    public void adicionarItem(ItemDoPedido item){
        this.itemDoPedido = item;
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTaxaDeEntrega(double taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }

    public double getTotal(){
        return this.taxaEntrega + this.itemDoPedido.getValor();
    }

    public void imprimir(){
        System.out.println("-----------------------------------");
        System.out.println("              Pizzaria             ");
        System.out.println("              Bate-Papo            ");
        System.out.println("-----------------------------------");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("-----------------------------------");
        System.out.println("Tipo: " + this.itemDoPedido.getTipo());
        System.out.println("Sabor: " + this.itemDoPedido.getSabor());
        System.out.println("Valor: " + this.itemDoPedido.getValor());
        System.out.println("-----------------------------------");
        System.out.println("Taxa Entrega: " + this.taxaEntrega);
        System.out.println("-----------------------------------");
        System.out.println("Total: " + this.getTotal());
        System.out.println("-----------------------------------");
    }

}
