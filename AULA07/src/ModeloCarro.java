// Subclasse ModeloCarro
class ModeloCarro extends Carro {
    public ModeloCarro(String nome, double[] precos) {
        setNomeModelo(nome);
        for (int i = 0; i < precos.length; i++) {
            setPrecoAnual(i, precos[i]);
        }
    }
}