import br.com.screenmatch.calculos.CalculadoraTempo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoLancamento(1970);
        filme1.setDuracaoMinutos(180);
        System.out.println("Duração do filme: " + filme1.getDuracaoMinutos());

        filme1.exibeFicha();
        filme1.avalia(7);
        filme1.avalia(5);
        filme1.avalia(9);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoLancamento(2000);
        serie1.exibeFicha();
        serie1.setTemporadas(10);
        serie1.setEpisodioTemporada(10);
        serie1.setMinutosEpisodio(50);
        System.out.println("Duração da serie: " + serie1.getDuracaoMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoLancamento(2023);
        filme2.setDuracaoMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

    }
}