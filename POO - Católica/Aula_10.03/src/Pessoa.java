import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {

    private String nome;
    private int idade;
    private int cpf;
    private LocalDate dataNascimento;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void apresentação () {
        System.out.println("Olá! Meu Nome é " + this.nome);
        System.out.println("Tenho " + this.idade + " anos de idade, pois nasci em " + this.dataNascimento);
        System.out.println("Sou portador do CPF " + this.cpf);
    }

    public void falarEmail () {
        System.out.println("Email: " + this.email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
