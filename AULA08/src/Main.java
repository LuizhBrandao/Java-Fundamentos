public class Main {
    public static void main(String[] args) {

//1 ConversorMoeda
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmReais = conversor.converterDolarParaReal(100);
        System.out.println("100 dólares equivalem a R$ " + valorEmReais);


//2 CalculadoraSalaRetangular
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5, 3);
        System.out.println("Área: " + sala.calcularArea());
        System.out.println("Perímetro: " + sala.calcularPerimetro());


//3 TabuadaMultiplicacao
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(7);
        tabuada.mostrarTabuada();


//4 ConversorTemperatura
        ConversorTemperaturaPadrao conversort = new ConversorTemperaturaPadrao();
        System.out.println("25°C em Fahrenheit: " + conversort.celsiusParaFahrenheit(25));
        System.out.println("77°F em Celsius: " + conversort.fahrenheitParaCelsius(77));

//5 Calculável (Livro e Produto Físico)
        Livro livro = new Livro(50, 10);
        ProdutoFisico produto = new ProdutoFisico(100, 15);
        System.out.println("Preço final do livro: R$ " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: R$ " + produto.calcularPrecoFinal());


//6 Vendável (Produto e Serviço)
        Produto produto1 = new Produto(20);
        Servico servico = new Servico(100);
        System.out.println("Preço total do produto (5 unidades): R$ " + produto1.calcularPrecoTotal(5));
        System.out.println("Preço com desconto do produto (10%): R$ " + produto1.aplicarDesconto(10));
        System.out.println("Preço total do serviço (3 unidades): R$ " + servico.calcularPrecoTotal(3));
        System.out.println("Preço com desconto do serviço (15%): R$ " + servico.aplicarDesconto(15));
    }
}