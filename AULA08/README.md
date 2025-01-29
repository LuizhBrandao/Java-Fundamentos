# Curso de Java: Aplicando a Orientação a Objetos

## AULA 08

Vamos explorar os fundamentos das interfaces no Java. Em uma interface, todos os métodos são automaticamente públicos, eliminando a necessidade da palavra reservada public em suas declarações. Além disso, assim como na herança, é possível aplicar o polimorfismo por meio de interfaces, proporcionando flexibilidade e coesão no código.

* Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

* Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

* Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

* Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

* Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

* Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

## Nessa aula, você aprendeu sobre:

* Que no Java uma classe pode herdar de somente uma única classe;

* O conceito de interfaces no Java;

* Que numa interface todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;

* Que também é possível aplicar o polimorfismo com o uso de interfaces, similar ao que foi demonstrado com a utilização da herança em aulas anteriores.