// Classe Carro
public class Carro {
    private String nomeModelo;
    private double[] precosAnuais = new double[3];

    // Define o nome do modelo
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    // Define o preço médio de um ano específico (0 para ano 1, 1 para ano 2, etc.)
    public void setPrecoAnual(int ano, double preco) {
        if (ano >= 0 && ano < precosAnuais.length) {
            precosAnuais[ano] = preco;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    // Calcula o menor preço
    public double calcularMenorPreco() {
        double menorPreco = Double.MAX_VALUE;
        for (double preco : precosAnuais) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    // Calcula o maior preço
    public double calcularMaiorPreco() {
        double maiorPreco = Double.MIN_VALUE;
        for (double preco : precosAnuais) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    // Exibe informações sobre o modelo
    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }
}