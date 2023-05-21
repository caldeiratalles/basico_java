package aula2.extend_without_abstract;

public class Humano extends Mamifero{

    private String nome;
    private String idade;
    private String sexo;

    public Humano(String raca, String nome, String idade, String sexo) {
        super(raca);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Humano(String raca) {
        super(raca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
