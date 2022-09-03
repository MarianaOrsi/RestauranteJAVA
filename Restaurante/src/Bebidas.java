public class Bebidas {
    String nomeBebida;
    boolean alcoolico;
    double porcao, kcal, valor;

    public Bebidas(String nomeBebida, boolean alcoolico, double porcao, double kcal, double valor) {
        this.nomeBebida = nomeBebida;
        this.alcoolico = alcoolico;
        this.porcao = porcao;
        this.kcal = kcal;
        this.valor = valor;
    }



    public static void main(String[] args) {
        Bebidas caipirinha = new Bebidas("Caipirinha", true, 300.0, 399.0, 20.0);

        System.out.println(caipirinha.nomeBebida);
    }
}
