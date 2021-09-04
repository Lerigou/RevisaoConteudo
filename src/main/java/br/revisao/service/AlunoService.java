package br.revisao.service;

import br.revisao.model.Aluno;

import java.util.List;

public interface AlunoService {

    public List<Aluno> findAll();

    public Aluno findById(Long id);

    public boolean save(Aluno aluno);

    public boolean deleteById(Long id);

}
