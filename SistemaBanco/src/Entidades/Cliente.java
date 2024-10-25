package Entidades;

public class Cliente implements Cloneable {
    // Atributos clientes
    private int id;
    private String nome;
    private String agencia;
    private int conta;

    // Construtor sem parâmetros (necessário para frameworks, mas também útil)
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(int id, String nome, String agencia, int conta) {
        this.id = id;
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setId(int novoId) {
        this.id = novoId;
    }

    public void setAgencia(String novaAgencia) {
        this.agencia = novaAgencia;
    }

    public void setConta(int novaConta) {
        this.conta = novaConta;
    }

    @Override
    public String toString() {
        return " Id: " + this.getId() + " Nome : " + this.getNome() + " Agencia : " + this.getAgencia() + " Conta : "
                + this.getConta();

    }

    @Override
    public Cliente clone() throws CloneNotSupportedException {
        return (Cliente) super.clone();
    }

}