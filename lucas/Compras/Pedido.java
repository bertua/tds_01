import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
public class Pedido{
    Map<String, Double> produtoEPreco = new HashMap<>();
    private LocalDate data;
    private String endereco;
    private double total = 0;
    private double frete;
    private Usuario cliente;
    private Produto produto;


    public void setProdutoEPreco(String produto, Double preco){
        this.produtoEPreco.put(produto, preco);
    }

    public void setCliente(Usuario cliente){
        this.cliente = cliente;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void setTotal(double total){
        this.total += total;
    }

    public void imprimir(){
        System.out.println("----------------------------------------");
        System.out.println("                  Shop                  ");
        System.out.println("----------------------------------------");
        System.out.println(formatar("Cliente", this.cliente.getNome()));
        System.out.println("----------------------------------------");
        for(String i: produtoEPreco.keySet()){
            System.out.println(formatar(i, String.valueOf(produtoEPreco.get(i))));
        }
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
