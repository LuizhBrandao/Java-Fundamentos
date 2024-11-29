import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner leitor = new Scanner(System.in);
         int numero1 = 0;
         System.out.println("Digite um número: ");
         numero1 = leitor.nextInt();

        if (numero1 >= 0){
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número negativo");
        }

        int numero2 = 0;
        int numero3 =0;
        System.out.println("Digite um número inteiro: ");
        numero2 = leitor.nextInt();
        System.out.println("Digite um número inteiro: ");
        numero3 = leitor.nextInt();

        if (numero2 == numero3){
            System.out.println("Os numeros:" + numero2 + " e " + numero3 + " são iguais");
        } else {
            System.out.println("Os numeros: " + numero2 + " e " + numero3 + " são diferentes");
        }
        if (numero2 > numero3){
            System.out.println("O primeiro numero é maior ");
        } else if (numero2 < numero3){
            System.out.println("O segundo numero é maior ");
        } else {
            System.out.println("Os números são iguais portanto nao há maior ou menor ");
        }

        System.out.println("###########");
        System.out.println("O digite o numero da ação desejada: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("###########");

        int numero4 = 0;
        int areaQuadrado = 0;
        int ladoQuadrado = 0;
        int raioCirculo = 0;
        float areaCirculo = 0f;
        float PI = 3.14f;


        numero4 = leitor.nextInt();

        if (numero4 == 1){

            System.out.println("digite o valor do lado do quadrado");
            ladoQuadrado = leitor.nextInt();
            areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println("A area desse quadrado é de : " + areaQuadrado );
        } else if (numero4 == 2){

            System.out.println("digite o valor do raio do circulo");
            raioCirculo = leitor.nextInt();
            areaCirculo = PI * (raioCirculo * raioCirculo);
            System.out.println("A area desse circulo é de : " + areaCirculo);

        }

        int numero5 = 0;
        int tabuada = 0;
        System.out.println("Digite um numero que gostaria de exibir a tabuada: " );

        numero5 = leitor.nextInt();
        for (int a = 0; a <= 10; a++ ){
            tabuada = a * numero5;
            System.out.println(a + " X " + numero5 + " = " + tabuada );
        }

        int numero6 = 0;
        int moduloDivisao =0;
        System.out.println("Digite um numero inteiro: ");
        numero6 = leitor.nextInt();
        moduloDivisao = numero6 % 2;
        switch (moduloDivisao){
            case 0:
                System.out.println("O número é Par !");
                break;
            case 1:
                System.out.println("O número é Ímpar ! ");
                break;
        }

        int numero7 = 0;
        int fatorial =0;
        System.out.println("Fatorial Digite um numero :");
        numero7 = leitor.nextInt();
        fatorial = numero7;
        while (numero7 > 1) {
            fatorial = fatorial * (numero7 - 1);
            numero7--;
        }
            System.out.println("Seu fatorial é:" + fatorial);

    }

}