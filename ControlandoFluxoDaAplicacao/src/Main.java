import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner leitor = new Scanner(System.in);
         int numero1 = 0;
         int numero2 = 0;
         double areaFigura = 0f;
         double ladoFigura = 0f;
         double PI = Math.PI;
         int tabuada = 0;
         int moduloDivisao = 0;
         int fatorial = 0;

// Número positivo ou negativo
         System.out.println("Digite um número: ");
         numero1 = leitor.nextInt();

        if (numero1 >= 0){
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número negativo");
        }

// Comparando numeros e dizendo qual é maior
        System.out.println("Digite um número inteiro: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite um número inteiro: ");
        numero2 = leitor.nextInt();

        if (numero1 == numero2){
            System.out.println("Os numeros:" + numero1 + " e " + numero2 + " são iguais");
        } else {
            System.out.println("Os numeros: " + numero1 + " e " + numero2 + " são diferentes");
        }
        if (numero1 > numero2){
            System.out.println("O primeiro numero é maior ");
        } else if (numero1 < numero2){
            System.out.println("O segundo numero é maior ");
        } else {
            System.out.println("Os números são iguais portanto nao há maior ou menor ");
        }
// Calcular area do quadrado ou circulo
        System.out.println("###########");
        System.out.println("O digite o numero da ação desejada: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("###########");

        numero1 = leitor.nextInt();

        if (numero1 == 1){

            System.out.println("Digite o valor do lado do quadrado");
            ladoFigura = leitor.nextDouble();
            areaFigura = Math.pow(ladoFigura,2);
            System.out.println("A area desse quadrado é de : " + areaFigura );
        } else if (numero1 == 2){

            System.out.println("Digite o valor do raio do circulo");
            ladoFigura = leitor.nextDouble();
            areaFigura = PI * Math.pow(ladoFigura,2);
            System.out.println("A area desse circulo é de : " + areaFigura);

        }

// Tabuada

        System.out.println("Digite um numero que gostaria de exibir a tabuada: " );

        numero1 = leitor.nextInt();
        for (int a = 1; a <= 10; a++ ){
            tabuada = a * numero1;
            System.out.println(a + " X " + numero1 + " = " + tabuada );
        }

// Par ou Impar

        System.out.println("Digite um numero inteiro: ");
        numero1 = leitor.nextInt();
        moduloDivisao = numero1 % 2;
        System.out.println((moduloDivisao == 0) ? "O número é Par!" : "O número é Ímpar");



// Fatorial

        System.out.println("Fatorial Digite um numero :");
        numero1 = leitor.nextInt();
        fatorial = numero1;
        while (numero1 > 1) {
            fatorial = fatorial * (numero1 - 1);
            numero1--;
        }
            System.out.println("Seu fatorial é:" + fatorial);

    }

}