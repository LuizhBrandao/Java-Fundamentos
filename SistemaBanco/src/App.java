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
        servicoDoCliente.cadastraCliente(cliente);
        Cliente busca = servicoDoCliente.buscaCliente(97L);

        System.out.println(busca.getNome());

        servicoDoCliente.deletaCliente(1L);

        Cliente buscaCliente = servicoDoCliente.buscaCliente(97L);
        buscaCliente.setNome(" Luiz Henrique ");
        buscaCliente.setId(3);
        servicoDoCliente.alteraCliente(97L, buscaCliente);
    }

}
