package Entidades;

public class Cliente {
    //Atributos clientes
    private int id;
    private String nome;
    private String agencia;
    private int conta;

    // Construtor sem parâmetros (necessário para frameworks, mas também útil)
    public Cliente() {  
    }
    
    // Construtor com parâmetros
    public Cliente(int id, String nome, String agencia, int conta){
        this.id = id;
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    // Métodos getters e setters
    public int getId(){
        return id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAgencia(){
        return agencia;
    }
    public int getConta(){
        return conta;
    }

    public void setNome (String novoNome){
        this.nome = novoNome;
    }

    public void setId (int novoId){
        this.id = novoId;
    }

    public void setAgencia (String novaAgencia){
        this.agencia = novaAgencia;
    }

    public void setConta (int novaConta){
        this.conta = novaConta;
    }

}



    /*  Métodos getters e setters
    

    public void setId(Long id) {
        this.id = id;
    }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "Pessoa{id=" + id + ", nome='" + nome + "', idade=" + idade + '}';
    }
}*/