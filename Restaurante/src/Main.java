import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bebidas bebida1 = new Bebidas("Caipirinha", true, 300.0, 399.0, 20.0);
        Bebidas bebida2 = new Bebidas("Saque", true, 200.0, 399.0, 20.0);
        Bebidas bebida3 = new Bebidas("Suco de Laranja", false, 500.0, 45.0, 20.0);
        Lanche lanche1 = new Lanche("X-Burguer", 1000.0, 1000.0, 20.0);
        Lanche lanche2 = new Lanche("X-Salada", 1000.0, 1000.0, 20.0);
        Cozinheiro cozinheiro1 = new Cozinheiro("Erick", "Jaco", "123456");
        Cozinheiro cozinheiro2 = new Cozinheiro("Fogazza", "Jaco", "123456");
        Cozinheiro cozinheiro3 = new Cozinheiro("Paola", "Jaco", "123456");
        Sobremesa sobremesa1 = new Sobremesa("Bolo", 1000.0, 1000.0, 20.0);
        Reserva reservaFelipe = new Reserva("Felipe", "Stefani", "33311122244", LocalDate.now());

        reservaFelipe.validarReserva();

        cozinheiro1.cozinhar(lanche1.nomeLanche);
        cozinheiro2.cozinhar(lanche2.nomeLanche);
        cozinheiro3.cozinhar(sobremesa1.nomeSobremesa);

        cozinheiro1.servirBebida(bebida1.nomeBebida);
        cozinheiro2.servirBebida(bebida2.nomeBebida);
        cozinheiro3.servirBebida(bebida3.nomeBebida);
    }
}