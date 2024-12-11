public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibir();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobraNumero(3);
        System.out.println("O dobro de 3 é = " + resultado + "\n");

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Locked Out of Heaven";
        minhaMusica.artista = "Bruno Mars";
        minhaMusica.anoLancamento = 2012;

        minhaMusica.exibirFicha();

        minhaMusica.avalia(5.5);
        minhaMusica.avalia(7.8);
        minhaMusica.avalia(9.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes + "\n");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "I30";
        meuCarro.ano = 2016;
        meuCarro.cor = "Prata";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos\n");

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Luiz";
        meuAluno.idade = 30;
        meuAluno.estudando = "Java";

        meuAluno.exibeInformacoes();

    }
}