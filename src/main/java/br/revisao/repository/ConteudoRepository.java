package br.revisao.repository;

import br.revisao.model.Aluno;
import br.revisao.model.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {

    public List<Conteudo> findByAluno(Aluno aluno);
    public List<Conteudo> findByAlunoIn(List<Aluno> alunos);

}
