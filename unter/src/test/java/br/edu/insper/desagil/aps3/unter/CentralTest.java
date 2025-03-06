package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central c;

    @BeforeEach
    void setUp() {
        c = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro() {
        assertEquals(0, c.mediaPassageiro("xxx.yyy.zzz-aa"));
    }

    @Test
    void nenhumaAvaliacaoMotorista() {
        assertEquals(0, c.mediaMotorista("xxx.yyy.zzz-aa"));
    }

    @Test
    void avaliacoesPassageiro() {
        Passageiro p = new Passageiro("zzz.yyy.xxx-aa", "nome2");
        Corrida c2 = new Corrida(p);
        Corrida c3 = new Corrida(p);
        Corrida c4 = new Corrida(p);
        c.adiciona(c2);
        c.adiciona(c3);
        c.adiciona(c4);
        c2.avaliaPassageiro(0);
        c3.avaliaPassageiro(4);
        c4.avaliaPassageiro(5);

        //assertEquals(4.5, c.mediaPassageiro("xxx.yyy.zzz-aa"));
    }
}
