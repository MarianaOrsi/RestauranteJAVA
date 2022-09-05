public class Cozinheiro {
    String nome, sobrenome, cpf;

    public Cozinheiro(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public void cozinhar(String nomeComida) {
        System.out.println("O cozinheiro " + this.nome + " preparou seu " + nomeComida);
    }

    public void servirBebida(String nomeBebida){
        System.out.println("O cozinheiro " + this.nome + " serviu sua " + nomeBebida);
    }

}
