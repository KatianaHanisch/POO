package com.apicomsqlite.poo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.apicomsqlite.poo.enity.Contrato;
import com.apicomsqlite.poo.service.ContratoService;

@RestController
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info() {
        return "Aplicacao ativa";
    }

    @RequestMapping(value = "createPessoa", method = RequestMethod.POST)
    public String createPessoa(@RequestBody Contrato pessoa) {
        return contratoService.createPessoa(pessoa);
    }

    @RequestMapping(value = "readanimais", method = RequestMethod.GET)
    public List<Contrato> readanimais() {
        return contratoService.readanimals();
    }

    @RequestMapping(value = "updateanimal", method = RequestMethod.PUT)
    public String updateanimal(@RequestBody Contrato animal) {
        return contratoService.updateanimal(animal);
    }

    @RequestMapping(value = "deleteanimal", method = RequestMethod.DELETE)
    public String deleteanimal(@RequestBody Contrato animal) {
        return contratoService.deleteanimal(animal);
    }
}
