package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro p;
    private Corrida c;

    @BeforeEach
    void setUp() {
        p = new Passageiro("xxx.yyy.zzz-aa", "nome");
        c = new Corrida(p);
    }

    @Test
    void constroi() {
        assertEquals("xxx.yyy.zzz-aa", p.getCpf());
        assertEquals("nome", p.getNome());
    }

    @Test
    void mudaNome() {
        p.setNome("nome2");
        assertEquals("nome2", p.getNome());
    }

    @Test
    void avalia() {
        c.avaliaMotorista(3);
        assertEquals(3, c.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        c.avaliaMotorista(0);
        assertEquals(1, c.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        c.avaliaMotorista(6);
        assertEquals(5, c.getNotaMotorista());
    }
}
