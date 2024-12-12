public class App {
    public static void CalculoMedia(){

        double nota1 = 6.37;
        double nota2 = 8.21;
    
        double media = (nota1 + nota2) / 2;
        String mensagem = String.format(" A media das notas é : %.2f" , media );
        System.out.println(mensagem);

    }    
      
    public static void Casting(){

        double variavel1 = 35.64;
        int variavel2 = (int) variavel1;
        System.out.println("Casting de double para int: " + variavel2);

    }

    public static void Concatenar(){

        char variavel1 = 'Z';
        String variavel2 = "Dog";
        System.out.println(variavel2 + " " + variavel1);

    }

    public static void Multiplica(){
        double precoProduto = 3.14159264;
        int quantidade = 2;
        double multi = precoProduto * quantidade;
        System.out.println("O valor total da compra é R$" + multi);

    }

    public static void CambioDolar(){
        double quantidadeEmDolar = 4.20;
        double precoDolar = 5.65;
        double quantidadeEmReal = quantidadeEmDolar * precoDolar;
        System.out.println("O valor em reais é: " + quantidadeEmReal);

    }

    public static void Desconto(){
        double precoOriginal = 14980;
        double percentualDesconto = 10;
        double desconto = (percentualDesconto / 100) * precoOriginal; 
        double novoPreco = precoOriginal - desconto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }

     public static void main(String[] args) throws Exception {
        App.CalculoMedia(); 
        App.Casting();
        App.Concatenar();
        App.Multiplica();
        App.CambioDolar();
        App.Desconto();


    }    
}
