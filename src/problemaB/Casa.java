package problemaB;

public class Casa {
    private double area;
    private Endereco endereco;
    private String cor;
    private Porta porta;
    private Garagem garagem;
    private boolean temMuro;
    private Proprietario proprietario;

    public Casa() {
    }

    public Casa(double area, Endereco endereco, String cor, Porta porta, Garagem garagem, boolean temMuro, Proprietario proprietario) {
        this.area = area;
        this.endereco = endereco;
        this.cor = cor;
        this.porta = porta;
        this.garagem = garagem;
        this.temMuro = temMuro;
        this.proprietario = proprietario;
    }

    public double calcularIPTU() {
        double valorVenal;
        String bairro = endereco.getBairro();

        double valorMetroQuadrado;
        if ("Boa Viagem".equalsIgnoreCase(bairro)) {
            valorMetroQuadrado = 1500.0;
        } else if ("Pina".equalsIgnoreCase(bairro)) {
            valorMetroQuadrado = 1200.0;
        } else if ("Boa Vista".equalsIgnoreCase(bairro)) {
            valorMetroQuadrado = 1000.0;
        } else {
            valorMetroQuadrado = 850.0;
        }

        valorVenal = this.getArea() * valorMetroQuadrado;

        double aliquota = 0.02; // Alíquota de 2%
        double valorImposto = valorVenal * aliquota;

        if (!temMuro) {
            valorImposto += valorVenal * 0.10; // Acréscimo de 10%
        }

        return valorImposto;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public boolean isTemMuro() {
        return temMuro;
    }

    public void setTemMuro(boolean temMuro) {
        this.temMuro = temMuro;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
