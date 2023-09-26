package com.apicomsqlite.poo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.apicomsqlite.poo.enity.Pessoa;
import com.apicomsqlite.poo.service.PessoaService;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(value = "pessoa", method = RequestMethod.GET)
    public String info() {
        return "Aplicacao ativa";
    }

    @RequestMapping(value = "createPessoa", method = RequestMethod.POST)
    public String createPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.createPessoa(pessoa);
    }

    @RequestMapping(value = "readPessoas", method = RequestMethod.GET)
    public List<Pessoa> readPessoas() {
        return pessoaService.readPessoas();
    }

    @RequestMapping(value = "updatePessoa", method = RequestMethod.PUT)
    public String updatePessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.updatePessoa(pessoa);
    }

    @RequestMapping(value = "deletePessoa", method = RequestMethod.DELETE)
    public String deletePessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.deletePessoa(pessoa);
    }
}
