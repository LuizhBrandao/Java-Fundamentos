// Classe que implementa a interface
class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CAMBIO = 5.39; // Exemplo de taxa de câmbio

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CAMBIO;
    }
}