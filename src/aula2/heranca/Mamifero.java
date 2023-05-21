package aula2.heranca;

public abstract class Mamifero {

    // Nao gosto muito de deixar parametros getter e setter para classe abstrata
    protected boolean bebeLeite = true;
    protected String raca;

    public abstract boolean instintoMaterno();

    public void setBebeLeite(boolean bebeLeite) {
        this.bebeLeite = bebeLeite;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isBebeLeite() {
        return bebeLeite;
    }

    public String getRaca() {
        return raca;
    }
}
