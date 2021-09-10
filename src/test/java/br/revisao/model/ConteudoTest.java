package br.revisao.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConteudoTest {

    private Conteudo conteudo;

    public ConteudoTest(){
        conteudo = new Conteudo();
    }

    @Test
    void getNome() {
        conteudo.setNome("mtm");
        assertEquals("mtm", conteudo.getNome());
    }

    @Test
    void setNome() {
        conteudo.setNome("física");
        assertEquals("física", conteudo.getNome());
    }

    @Test
    void getDescricao() {
        conteudo.setDescricao("Descricao do conteudo");
        assertEquals("Descricao do conteudo", conteudo.getDescricao());
    }

    @Test
    void setDescricao() {
        conteudo.setDescricao("Descricao do conteudo");
        assertEquals("Descricao do conteudo", conteudo.getDescricao());
    }

    @Test
    void getData() {
    }

    @Test
    void setData() {
    }
}