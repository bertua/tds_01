import java.util.ArrayList;
public class Pedido{
    private int id;
    private double taxaEntrega;
    private ArrayList<ItemDoPedido> itensDoPedido = new ArrayList<>();
    private String cliente;

    public void adicionarItem(ItemDoPedido item){
        this.itensDoPedido.add(item);
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setTaxaDeEntrega(double taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }

    public double getTotal (){
        
    }

    public void imprimir(){
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Entrega: " + this.cliente);
        System.out.println("Entrega: " + this.cliente);
    }

}
