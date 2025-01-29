// Classe ProdutoFisico
class ProdutoFisico implements Calculavel {
    private double preco;
    private double taxaAdicional;

    public ProdutoFisico(double preco, double taxaAdicional) {
        this.preco = preco;
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaAdicional;
    }
}