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
        System.out.println("----------------------------------------");
        System.out.println("                 Pizzaria               ");
        System.out.println("                 Luigi's                ");
        System.out.println("----------------------------------------");
        System.out.println(formatar("Cliente", this.cliente));
        System.out.println("----------------------------------------");
        System.out.println(formatar("Tipo", this.itemDoPedido.getTipo()));
        System.out.println(formatar("Sabor", this.itemDoPedido.getSabor()));
        System.out.println(formatar("Valor", String.valueOf(this.itemDoPedido.getValor())));
        System.out.println("----------------------------------------");
        System.out.println(formatar("Tx. Entrega", String.valueOf(this.taxaEntrega)));
        System.out.println("----------------------------------------");
        System.out.println(formatar("Total", String.valueOf(this.getTotal())));
        System.out.println("----------------------------------------");
    }

    private static String formatar(String titulo, String item){
        String div = "----------------------------------------";
        int finalDiv = div.length() -1;
        int finalItem = titulo.length() + item.length() -1;

        while(finalDiv != finalItem && item.length() < div.length()){
            item = " " + item;
            finalItem = titulo.length() + item.length() -1;

        }
        return titulo + item;
    }
}
