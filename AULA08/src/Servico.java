// Classe Serviço
class Servico implements Vendavel {
    private double precoBase;

    public Servico(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoBase * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return precoBase - (precoBase * percentual / 100);
    }
}