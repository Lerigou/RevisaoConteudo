package br.revisao.service;

import br.revisao.model.Aluno;
import br.revisao.model.Conteudo;
import br.revisao.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConteudoServiceImpl implements ConteudoService{

    @Autowired
    ConteudoRepository conteudoRepository;

    @Override
    public List<Conteudo> findAll(){
        return conteudoRepository.findAll();
    }

    @Override
    public boolean save(Conteudo conteudo) {
        try {
            if (conteudo != null) {
                conteudoRepository.save(conteudo);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Conteudo findById(Long id) {
        return conteudoRepository.findById(id).get();
    }

    @Override
    public List<Conteudo> findByAluno(Aluno aluno) {
        return conteudoRepository.findByAluno(aluno);
    }

    @Override
    public List<Conteudo> findByAlunoIn(List<Aluno> alunos) {
        return conteudoRepository.findByAlunoIn(alunos);
    }

    @Override
    public boolean deleteById(Long id) {
        try{
            conteudoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
