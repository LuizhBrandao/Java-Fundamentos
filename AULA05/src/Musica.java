public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    int somaAvaliacoes;
    int numAvaliacoes;


    public void exibirFicha() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / numAvaliacoes;
    }

}
