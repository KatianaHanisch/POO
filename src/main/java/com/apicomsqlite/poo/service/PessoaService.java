package com.apicomsqlite.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apicomsqlite.poo.enity.Pessoa;
import com.apicomsqlite.poo.repository.PessoaRepository;
import jakarta.transaction.Transactional;

@Service
public class PessoaService {

    @Autowired(required = false)
    private PessoaRepository pessoaRepository;

    @Transactional
    public String createPessoa(Pessoa pessoa) {
        try {
            if (!pessoaRepository.existsByNomePessoa(pessoa.getNomePessoa())) {
                pessoa.setId(null == pessoaRepository.findMaxId() ? 1 : pessoaRepository.findMaxId() + 1);
                pessoaRepository.save(pessoa);
                return "pessoa cadastrado com sucesso.";
            } else {
                return "pessoa já existe no banco.";
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Pessoa> readPessoas() {
        return pessoaRepository.findAll();
    }

    @Transactional
    public String updatePessoa(Pessoa pessoa) {
        if (pessoaRepository.existsByNomePessoa(pessoa.getNomePessoa())) {
            try {
                List<Pessoa> pessoas = pessoaRepository.findByNomePessoa(pessoa.getNomePessoa());
                pessoas.stream().forEach(s -> {
                    Pessoa pessoaToBeUpdate = pessoaRepository.findById(s.getId()).get();
                    pessoaToBeUpdate.setTipoPessoa(pessoa.getTipoPessoa());
                    pessoaRepository.save(pessoaToBeUpdate);
                });
                return "pessoa atualizado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "pessoa não existe no banco.";
        }
    }

    @Transactional
    public String deletePessoa(Pessoa pessoa) {
        if (pessoaRepository.existsByNomePessoa(pessoa.getNomePessoa())) {
            try {
                List<Pessoa> pessoas = pessoaRepository.findByNomePessoa(pessoa.getNomePessoa());
                pessoas.stream().forEach(s -> {
                    pessoaRepository.delete(s);
                });
                return "pessoa deletado.";
            } catch (Exception e) {
                throw e;
            }

        } else {
            return "pessoa n\u00E3o existe no banco.";
        }
    }
}