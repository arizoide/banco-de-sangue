package com.senac.bancodesangue.controller;


import com.senac.bancodesangue.dao.DoadorDAO;
import com.senac.bancodesangue.model.Doador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoadorController {

    @Autowired
    DoadorDAO dao;
    
    @GetMapping("/cad_doador")
    public String abrirDoacao(Doador doador){
        return "cad_doador";
    }

    @PostMapping("/cad_doador")
    public String cadastrarDoador(Doador doador){
        dao.save(doador);
        return "index";
    }

    @GetMapping("/listar_doadores")
    public String listarDoadores(Model model){
        model.addAttribute("doadores", dao.findAll());
        return "listar_doadores";
    }
}
