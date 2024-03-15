public class ItemDoPedido{
    private double valor;
    private String sabor;
    private String tipo;


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public String getTipo(){
        return this.tipo;
    }

}
