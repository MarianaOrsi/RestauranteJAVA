public class Sobremesa {

    String nomeSobremesa;
    double kcal, pesoAprox, valor;

    public Sobremesa(String nomeSobremesa, double kcal, double pesoAprox, double valor) {
        this.nomeSobremesa = nomeSobremesa;
        this.kcal = kcal;
        this.pesoAprox = pesoAprox;
        this.valor = valor;
    }

    public String getNomeSobremesa() {
        return nomeSobremesa;
    }

    public void setNomeSobremesa(String nomeSobremesa) {
        this.nomeSobremesa = nomeSobremesa;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }




}
