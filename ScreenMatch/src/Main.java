import br.com.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoLancamento(1970);
        filme1.setDuracaoMinutos(180);

        filme1.exibeFicha();
        filme1.avalia(7);
        filme1.avalia(5);
        filme1.avalia(9);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

    }
}