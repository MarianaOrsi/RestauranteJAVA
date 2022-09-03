public class Cozinheiro {
    String nome, sobrenome, cpf;

    public Cozinheiro(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public static void Cozinhar(String nomeCozinheiro, String nomeComida){
        System.out.println("O cozinheiro "+ nomeCozinheiro +" preparou seu " + nomeComida);
    }

    public static void main(String[] args) {
        Cozinheiro chef1 = new Cozinheiro("Erick", "Jaco", "123456");
        Cozinhar(chef1.nome, "Bolo");

    }
}
