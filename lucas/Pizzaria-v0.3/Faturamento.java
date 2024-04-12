import java.util.ArrayList;
public class Faturamento{
    private double totalGeral = 0;
    private double totalMotoboy = 0;
    private double totalLiquido = 0;
    private ArrayList<Pedido> pedido = new ArrayList<>();
    private Pedido boleto;

    public void setBoleto(Pedido boleto){
        this.boleto = boleto;
    }

    public void setTotalGeral(double totalGeral){
        this.totalGeral += totalGeral;
    }

    public double getTotalGeral(){
        return this.totalGeral;
    }

    public void setTotalMotoboy(double totalMotoboy){
        this.totalMotoboy += totalMotoboy;
    }

    public double getTotalMotoboy(){
        return this.totalMotoboy;
    }

    public void setTotalLiquido(){
        this.totalLiquido = this.totalGeral - this.totalMotoboy;
    }

    public void addPedido(Pedido pedido){
        this.pedido.add(pedido);
    }

    public void imprimirHistorico(){
        System.out.println("----------------------------------------");
        System.out.println("                 Pizzaria               ");
        System.out.println("                 Luigi's                ");
        System.out.println("----------------------------------------");
        for(int i = 0; i < pedido.size(); i++){
            pedido.get(i).imprimir();
        }
        System.out.println("----------------------------------------");
        System.out.println(boleto.formatar("Total Geral", String.valueOf(this.totalGeral)));
        System.out.println(boleto.formatar("Total Motoboy", String.valueOf(this.totalMotoboy)));
        System.out.println(boleto.formatar("Total Liquido", String.valueOf(this.totalLiquido)));
        System.out.println("----------------------------------------");
    }

}