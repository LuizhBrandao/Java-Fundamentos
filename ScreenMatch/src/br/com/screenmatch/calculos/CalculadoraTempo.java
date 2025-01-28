package br.com.screenmatch.calculos;


import br.com.screenmatch.modelos.Titulo;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
