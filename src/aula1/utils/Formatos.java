package aula1.utils;

public enum Formatos {
    // dia mes ano
    // 13 Jun 2000
    dia_mes_ano("dd 'de' MMMM 'de' yyyy");
    // dia-mes-ano
    // 26-06-2000

    public String formato;
    Formatos(String formato) {
        this.formato = formato;
    }

    // ano-mes-dia HH:mm
}
