package problemaB;

public class Garagem {
    private int qtdCarros;
    private boolean coberta;
    private Porta porta;

    public Garagem() {
    }

    public Garagem(int qtdCarros, boolean coberta, Porta porta) {
        this.qtdCarros = qtdCarros;
        this.coberta = coberta;
        this.porta = porta;
    }

    public int getQtdCarros() {
        return qtdCarros;
    }

    public void setQtdCarros(int qtdCarros) {
        this.qtdCarros = qtdCarros;
    }

    public boolean isCoberta() {
        return coberta;
    }

    public void setCoberta(boolean coberta) {
        this.coberta = coberta;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

}
