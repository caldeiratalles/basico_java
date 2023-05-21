package aula2.extend_without_abstract;

public class Mamifero {

    private boolean bebeLeite = true;
    private String raca;

    public Mamifero(String raca) {
        this.raca = raca;
    }

    public boolean instintoMaternal(){
        return true;
    }

    public boolean isBebeLeite() {
        return bebeLeite;
    }

    public String getRaca() {
        return raca;
    }
}
