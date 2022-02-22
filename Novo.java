public class Novo extends Imovel {
    private double adiconal;

    public double getAdiconal() {
        return adiconal;
    }

    public void setAdiconal(double adiconal) {
        this.adiconal = adiconal;
    }

    private double totalNovo;
    totalNovo = getPreco + getAdiconal;
}
