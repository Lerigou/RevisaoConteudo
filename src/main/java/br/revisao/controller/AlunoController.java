package br.revisao.controller;

import br.revisao.model.Aluno;
import br.revisao.model.Conteudo;
import br.revisao.service.AlunoServiceImpl;
import br.revisao.service.ConteudoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

    @Autowired
    AlunoServiceImpl alunoService;

    @GetMapping("/aluno/list")
    public String List(Model model){
        model.addAttribute("alunos", alunoService.findAll());
        return "aluno/list";
    }

    @GetMapping("/aluno/add")
    public String addAluno(Model model) {
        model.addAttribute("aluno", new Aluno());
        model.addAttribute("alunos", alunoService.findAll());
        return "aluno/add";
    }

    @PostMapping("/aluno/save")
    public String save(Aluno aluno, Model model) {
        if (alunoService.save(aluno)) {
            return "redirect:/aluno/list";
        } else {
            model.addAttribute("aluno", aluno);
            return "aluno/add";
        }
    }

    @GetMapping("/aluno/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("aluno", alunoService.findById(id));
        return "aluno/edit";
    }

    @GetMapping("/aluno/delete/{id}")
    public String delete(@PathVariable Long id) {
        if(alunoService.deleteById(id)) {
            return "redirect:/aluno/list";
        } else {
            return "aluno/list";
        }
    }
}
