import java.util.Scanner;
public class Mecanica{
    public static void main(){
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        Servicos servico = new Servicos();
        OrdemServico OrdemServico = new OrdemServico();
        
        System.out.println("Cliente");
        System.out.print("Nome: ");
        cliente.setNome(input.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereço(input.nextLine());
        System.out.print("CPF: ");
        cliente.setCPF(input.nextLine());
        System.out.print("Contato: ");
        cliente.setContato(input.nextLine());

        System.out.println("Veículo");
        System.out.print("Descrição: ");
        veiculo.setDescriçao(input.nextLine());
        System.out.print("Placa: ");
        veiculo.setPlaca(input.nextLine());
        System.out.print("Ano: ");
        veiculo.setDAno(input.nextLine());

        System.out.println("Serviço");
        System.out.print("Valor: ");
        servico.setValor(input.nextDouble());
        input.nextLine();
        System.out.print("Descrição: ");
        servico.setDescriçao(input.nextLine());
    }
}
