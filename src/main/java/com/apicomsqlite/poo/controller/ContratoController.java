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

    @RequestMapping(value = "contrato", method = RequestMethod.GET)
    public String info() {
        return "Aplicacao ativa";
    }

    @RequestMapping(value = "createContrato", method = RequestMethod.POST)
    public String createContrato(@RequestBody Contrato contrato) {
        return contratoService.createContrato(contrato);
    }

    @RequestMapping(value = "readContratos", method = RequestMethod.GET)
    public List<Contrato> readContratos() {
        return contratoService.readContratos();
    }

    @RequestMapping(value = "updateContrato", method = RequestMethod.PUT)
    public String updateContrato(@RequestBody Contrato contrato) {
        return contratoService.updateContrato(contrato);
    }

    @RequestMapping(value = "deleteContrato", method = RequestMethod.DELETE)
    public String deleteContrato(@RequestBody Contrato contrato) {
        return contratoService.deleteContrato(contrato);
    }
}
