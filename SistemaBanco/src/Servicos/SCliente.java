package Servicos;

import java.util.HashMap;
import java.util.Map;

import Entidades.Cliente;

public class SCliente {
    Map<Long, Cliente> clienteMap;

    public SCliente(){
        this.clienteMap = new HashMap<>();
        this.clienteMap.put(1L, new Cliente( 1 , "João", "25" , 123));
    }

    public Cliente buscaCliente(Long id){
        Cliente cliente = this.clienteMap.get(id);
        return cliente;
    }

    public void cadastraCliente(Cliente cliente){
        Long idFormatado = Long.valueOf(cliente.getId());
        this.clienteMap.put(idFormatado, cliente);   
    }

}
