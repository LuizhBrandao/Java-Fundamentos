public class Main {
    public static void main(String[] args) {

//CONTA BANCARIA
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(111);
        conta.setSaldo(1359);
        conta.titular = "Luiz";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1537);
        System.out.println("Novo Saldo: " + conta.getSaldo() + "\n");


//IDADE PESSOA
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Luiz");
        pessoa1.setIdade(30);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(17);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
        System.out.println("\n");


//PRODUTO
        Produto produto = new Produto("Celular", 3130.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(19);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco() + "\n");


//ALUNO

        Aluno aluno1 = new Aluno("Luiz", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 5.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia() + "\n");

//LIVRO

        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }

}