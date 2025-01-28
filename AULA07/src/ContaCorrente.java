// Subclasse ContaCorrente
class ContaCorrente extends ContaBancaria {
    private static final double TARIFA_MENSAL = 15.00;

    public void cobrarTarifaMensal() {
        System.out.println("Cobrando tarifa mensal de: " + TARIFA_MENSAL);
        sacar(TARIFA_MENSAL);
    }
}