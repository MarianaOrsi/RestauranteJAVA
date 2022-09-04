import java.time.LocalDate;

public class Reserva {
    private String nomeCliente, sobrenomeCliente, cpf;
    private LocalDate dataReserva;

    public Reserva(String nomeCliente, String sobrenomeCliente, String cpf, LocalDate dataReserva) {
        this.nomeCliente = nomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.cpf = cpf;
        this.dataReserva = dataReserva;
    }

    public void validarReserva(){
        System.out.println("Reserva validada na data " + getDataReserva() + "!");
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }
}
