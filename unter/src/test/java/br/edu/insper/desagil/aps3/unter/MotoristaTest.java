package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private Motorista m;
    private Corrida c;

    @BeforeEach
    void setUp() {
        m = new Motorista("xxx.yyy.zzz-aa", "nome");
        Passageiro p = new Passageiro("zzz.yyy.xxx-aa", "nome2");
        c = new Corrida(p);
    }

    @Test
    void constroi() {
        assertEquals("xxx.yyy.zzz-aa", m.getCpf());
        assertEquals("nome", m.getNome());
    }

    @Test
    void mudaNome() {
        m.setNome("nome2");
        assertEquals("nome2", m.getNome());
    }

    @Test
    void avalia() {
        c.avaliaPassageiro(3);
        assertEquals(3, c.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        c.avaliaPassageiro(0);
        assertEquals(1, c.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        c.avaliaPassageiro(6);
        assertEquals(5, c.getNotaPassageiro());
    }

}
