package com.apicomsqlite.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apicomsqlite.poo.enity.Contrato;
import com.apicomsqlite.poo.repository.ContratoRepository;
import jakarta.transaction.Transactional;

@Service
public class ContratoService {

    @Autowired(required = false)
    private ContratoRepository animaloRespository;

    @Transactional
    public String createanimal(Contrato animal) {
        try {
            if (!animaloRespository.existsByNome(animal.getNome())) {
                animal.setId(null == animaloRespository.findMaxId() ? 1 : animaloRespository.findMaxId() + 1);
                animaloRespository.save(animal);
                return "animal cadastrado com sucesso.";
            } else {
                return "animal já existe no banco.";
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Contrato> readanimals() {
        return animaloRespository.findAll();
    }

    @Transactional
    public String updateanimal(Contrato animal) {
        if (animaloRespository.existsByNome(animal.getNome())) {
            try {
                List<Contrato> animals = animaloRespository.findByNome(animal.getNome());
                animals.stream().forEach(s -> {
                    Contrato animalToBeUpdate = animaloRespository.findById(s.getId()).get();
                    animalToBeUpdate.setNome(animal.getNome());
                    animalToBeUpdate.setEspecie(animal.getEspecie());
                    animalToBeUpdate.setIdade(animal.getIdade());
                    animalToBeUpdate.setRaca(animal.getRaca());
                    animalToBeUpdate.setCor(animal.getCor());
                    animaloRespository.save(animalToBeUpdate);
                });
                return "animal atualizado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "animal não existe no banco.";
        }
    }

    @Transactional
    public String deleteanimal(Contrato animal) {
        if (animaloRespository.existsByNome(animal.getNome())) {
            try {
                List<Contrato> animals = animaloRespository.findByNome(animal.getNome());
                animals.stream().forEach(s -> {
                    animaloRespository.delete(s);
                });
                return "animal deletado.";
            } catch (Exception e) {
                throw e;
            }

        } else {
            return "animal n\u00E3o existe no banco.";
        }
    }
}