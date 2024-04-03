import java.util.ArrayList;
public class OrdemServico{
    private double total;
    private Cliente cliente;
    private Veiculo veiculo;
    private ArrayList<Servicos> servico;

    public void addTotal(double total){
        this.total += total;
    }

    public double getTotal(){
        return this.total;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }


    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo(){
        return this.veiculo;
    }

    public void addServico(Servicos servico){
        this.servico.add(servico);
    }



}