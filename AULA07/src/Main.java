public class Main {
    public static void main(String[] args) {

//DESAFIO 1 (CARRO - MODELOCARRO)
        double[] precos = {45000, 47000, 48000};
        ModeloCarro modelo = new ModeloCarro("Sedan XYZ", precos);
        modelo.exibirInformacoes();


//DESAFIO 2 (ANIMAL - CACHORRO - GATO)
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom(); // Saída: Au Au
        gato.emitirSom(); // Saída: Miau

        ((Cachorro) cachorro).abanarRabo();
        ((Gato) gato).arranharMoveis();


//DESAFIO 3 (CONTABANCARIA - CONTACORRENTE)
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(200);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();


//DESAFIO 4 (NUMEROSPRIMOS - VERIFICADORPRIMO - GERADORPRIMO)
        VerificadorPrimo verificador = new VerificadorPrimo();
        System.out.println("É primo? " + verificador.verificarSeEhPrimo(29)); // true

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println("Próximo primo: " + gerador.gerarProximoPrimo(29)); // 31

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(50); // Lista de primos até 50

    }
}