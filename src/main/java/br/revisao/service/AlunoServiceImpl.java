package br.revisao.service;

import br.revisao.model.Aluno;
import br.revisao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    @Override
    public boolean save(Aluno aluno) {
        try {
            if (aluno != null) {
                alunoRepository.save(aluno);
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
    public Aluno findById(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public boolean deleteById(Long id) {
        try{
            alunoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
