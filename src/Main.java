import aula1.objetos.Pessoa;
import aula1.utils.Formatos;
import aula2.heranca.Humano;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        // testes

        p1.setNome("Talles Marcelo");
        p1.setCpf("xxx.xxx.xxx-xx");
        p1.setData_nascimento(LocalDateTime.of(2000,6,26,13,42));
        p1.setSexo("masculino");

        Pessoa p2 = new Pessoa();

        p2.setNome("Talles Marcelo - p2");
        p2.setCpf("xxx.xxx.xxx-xx - p2");
        p2.setData_nascimento(LocalDateTime.of(2000,6,26,13,42));
        p2.setSexo("masculino - p2");

        Pessoa p3 = new Pessoa();

        p3.setNome("Talles Marcelo - p3");
        p3.setCpf("xxx.xxx.xxx-xx - p3");
        p3.setData_nascimento(LocalDateTime.of(2000,6,26,13,42));
        p3.setSexo("masculino - p3");

        // Copiando de p2 da memoria para p1
        p1.setNome(p2.getNome());

        System.out.println(p1.formatarData(Formatos.dia_mes_ano.formato));

        // Temos que usar o setter dentro da classe abstrata -> Fica ruim(Opniao minha)
        Humano humanoHeranca = new Humano("Talles", "12", "Masculino");
    }
}