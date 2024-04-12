import java.util.ArrayList;
public class Pedido{
    private double taxaEntrega;
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<>();
    private String cliente;
    private String bairro;
    private double total = 0;

    public void addItem(ItemDoPedido item){
        this.itemDoPedido.add(item);
    }

    public ArrayList<ItemDoPedido> getItem(){
        return this.itemDoPedido;
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTaxaDeEntrega(String bairro){
        if(bairro.equals("centro")){
            taxaEntrega = 10;
        } else if (bairro.equals("periferia")){
            taxaEntrega =  15;
        } else {
            taxaEntrega =  20;
        }
    }

    public double getTaxaDeEntrega(){
        return this.taxaEntrega;
    }

    public void setTotal(double total){
        this.total += total;
    }

    public double getTotal(){
        return this.total;
    }

    public void resetTotal(){
        this.total = 0;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void imprimir(){
        System.out.println(formatar("Cliente", this.cliente));
        for(int i = 0; i < itemDoPedido.size(); i++){
            System.out.println(formatar("", this.itemDoPedido.get(i).getTipo() + " " + this.itemDoPedido.get(i).getSabor() + " R$" + String.valueOf(this.itemDoPedido.get(i).getValor())));
        }
        System.out.println("----------------------------------------");
        System.err.println(formatar("Bairro", this.bairro));
        System.out.println(formatar("Tx. Entrega", String.valueOf(this.taxaEntrega)));
        System.out.println("----------------------------------------");
        System.out.println(formatar("Total", String.valueOf(this.total)));
        System.out.println("----------------------------------------");
    }

    public static String formatar(String titulo, String item){
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
