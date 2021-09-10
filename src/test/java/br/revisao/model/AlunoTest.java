package br.revisao.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    public AlunoTest(){
        aluno = new Aluno();
    }

    @Test
    void getNome() {
        aluno.setNome("Jao");
        assertEquals("Jao", aluno.getNome());
    }

    @Test
    void setNome() {
        aluno.setNome("Luan");
        assertEquals("Luan", aluno.getNome());
    }

    @Test
    void getTurma() {
        aluno.setTurma("C");
        assertEquals("C", aluno.getTurma());
    }

    @Test
    void setTurma() {
        aluno.setTurma("B");
        assertEquals("B", aluno.getTurma());
    }

    @Test
    void getAno() {
        aluno.setAno("Terceirão");
        assertEquals("Terceirão", aluno.getAno());
    }

    @Test
    void setAno() {
        aluno.setAno("Segundo");
        assertEquals("Segundo", aluno.getAno());
    }
}