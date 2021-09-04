package br.revisao.controller;

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
public class ConteudoController {

    @Autowired
    ConteudoServiceImpl conteudoService;

    @Autowired
    AlunoServiceImpl alunoService;

    @GetMapping("/conteudo/list")
    public String List(Model model){
        model.addAttribute("conteudos", conteudoService.findAll());
        return "conteudo/list";
    }

    @GetMapping("/conteudo/add")
    public String addConteudo(Model model) {
        model.addAttribute("conteudo", new Conteudo());
        model.addAttribute("alunos", alunoService.findAll());
        return "conteudo/add";
    }

    @PostMapping("/conteudo/save")
    public String save(Conteudo conteudo, Model model) {
        if (conteudoService.save(conteudo)) {
            return "redirect:/conteudo/list";
        } else {
            model.addAttribute("conteudo", conteudo);
            return "conteudo/add";
        }
    }

    @GetMapping("/conteudo/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("conteudo", conteudoService.findById(id));
        model.addAttribute("alunos", alunoService.findAll());
        return "conteudo/edit";
    }

    @GetMapping("/conteudo/delete/{id}")
    public String delete(@PathVariable Long id) {
        if(conteudoService.deleteById(id)) {
            return "redirect:/conteudo/list";
        } else {
            return "conteudo/list";
        }
    }

}
