package Servicos;

import java.util.HashMap;
import java.util.Map;

import Entidades.Cliente;

public class SCliente {
    Map<Long, Cliente> clienteMap;

    public SCliente() {
        this.clienteMap = new HashMap<>();
        this.clienteMap.put(1L, new Cliente(1, "João", "25", 123));
    }

    public Cliente buscaCliente(Long id) throws CloneNotSupportedException {
        Cliente cliente = this.clienteMap.get(id);
        return (cliente.clone());
    }

    public void cadastraCliente(Cliente cliente) {
        Long idFormatado = Long.valueOf(cliente.getId());
        this.clienteMap.put(idFormatado, cliente);
        for (Map.Entry<Long, Cliente> entry : this.clienteMap.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Nome: " + entry.getValue().getNome());
        }
    }

    public void deletaCliente(Long id) throws CloneNotSupportedException {
        Cliente cliente = this.buscaCliente(id);
        this.clienteMap.remove(id);
        System.out.println(" o cliente " + cliente.getNome() + " foi deletado ");
        for (Map.Entry<Long, Cliente> entry : this.clienteMap.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Nome: " + entry.getValue().getNome());
        }
    }

    public void alteraCliente(Long id, Cliente clienteAlterado) throws CloneNotSupportedException {
        Cliente cliente = this.buscaCliente(id);
        System.out.println(cliente);
        String nomeDoCliente = clienteAlterado.getNome();
        cliente.setNome(nomeDoCliente);
        this.clienteMap.put(id, cliente);
        System.out.println(cliente);
    }

}
