package aula1.objetos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private String cpf;
    private LocalDateTime data_nascimento;
    private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, LocalDateTime data_nascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
    }

    public String formatarData(String formato) {
        if(this.data_nascimento == null){
            return "data nao foi iniciada";
        }
        return this.data_nascimento.format(DateTimeFormatter.ofPattern(formato));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Objeto Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
