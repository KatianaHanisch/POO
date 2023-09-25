package com.apicomsqlite.poo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.apicomsqlite.poo.enity.Contrato;
import com.apicomsqlite.poo.service.ContratoService;

@RestController
public class ContratoController {

    @Autowired
    private ContratoService animalService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info() {
        return "Aplicacao ativa";
    }

    @RequestMapping(value = "createanimal", method = RequestMethod.POST)
    public String createanimal(@RequestBody Contrato animal) {
        return animalService.createanimal(animal);
    }

    @RequestMapping(value = "readanimais", method = RequestMethod.GET)
    public List<Contrato> readanimais() {
        return animalService.readanimals();
    }

    @RequestMapping(value = "updateanimal", method = RequestMethod.PUT)
    public String updateanimal(@RequestBody Contrato animal) {
        return animalService.updateanimal(animal);
    }

    @RequestMapping(value = "deleteanimal", method = RequestMethod.DELETE)
    public String deleteanimal(@RequestBody Contrato animal) {
        return animalService.deleteanimal(animal);
    }
}
