import Entidades.Cliente;
import Servicos.SCliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(3 , " Luiz ", " 1a ", 99 ); 
        SCliente servicoDoCliente = new SCliente();
        int idCliente = cliente.getId();
        String nomeCliente = cliente.getNome();
        String agenciaCliente = cliente.getAgencia();
        int contaCliente = cliente.getConta();
    
        System.out.println("Ok " + idCliente + nomeCliente + agenciaCliente + contaCliente );
    
        cliente.setNome(" Brandão " );
        nomeCliente = cliente.getNome();
        
        cliente.setId(97);
        idCliente = cliente.getId();

        cliente.setAgencia(" Bradesco1 ");
        agenciaCliente = cliente.getAgencia();

        cliente.setConta(3562);
        contaCliente = cliente.getConta();
        
        System.out.println("Ok " + idCliente + nomeCliente + agenciaCliente + contaCliente );
        //a fazer EX o nome do cliente é .... System.out.println(cliente);
        servicoDoCliente.cadastraCliente(cliente);
        Cliente busca = servicoDoCliente.buscaCliente(97L);

        System.out.println(busca.getNome());

    }

}
