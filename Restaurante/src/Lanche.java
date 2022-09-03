public class Lanche {

    String nomeLanche;
    double kcal, pesoAprox, valor;

    public Lanche(String nomeLanche, double kcal, double pesoAprox, double valor) {
        this.nomeLanche = nomeLanche;
        this.kcal = kcal;
        this.pesoAprox = pesoAprox;
        this.valor = valor;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
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




    public static void main(String[] args) {
        Lanche XBurguer = new Lanche("X-Burguer", 1000.0, 1000.0, 20.0);
        System.out.println(XBurguer.nomeLanche);
    }
}
