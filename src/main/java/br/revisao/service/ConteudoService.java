package br.revisao.service;

import br.revisao.model.Aluno;
import br.revisao.model.Conteudo;

import java.util.List;

public interface ConteudoService {

    public List<Conteudo> findAll();
    public Conteudo findById(Long id);

    public List<Conteudo> findByAluno(Aluno aluno);
    public List<Conteudo> findByAlunoIn(List<Aluno> alunos);

    public boolean save(Conteudo conteudo);
    public boolean deleteById(Long id);


}
