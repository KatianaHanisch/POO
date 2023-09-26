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
    private ContratoRepository contratoRepository;

    @Transactional
    public String createContrato(Contrato contrato) {
        try {
            if (!contratoRepository.existsByNomeContrato(contrato.getNomeContrato())) {
                contrato.setId(null == contratoRepository.findMaxId() ? 1 : contratoRepository.findMaxId() + 1);
                contratoRepository.save(contrato);
                return "contrato cadastrado com sucesso.";
            } else {
                return "contrato já existe no banco.";
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Contrato> readContratos() {
        return contratoRepository.findAll();
    }

    @Transactional
    public String updateContrato(Contrato contrato) {
        if (contratoRepository.existsByNomeContrato(contrato.getNomeContrato())) {
            try {
                List<Contrato> contratos = contratoRepository.findByNomeContrato(contrato.getNomeContrato());
                contratos.stream().forEach(s -> {
                    Contrato contratoToBeUpdate = contratoRepository.findById(s.getId()).get();
                    contratoToBeUpdate.setIdCliente(contrato.getIdCliente());
                    contratoToBeUpdate.setIdVendedor(contrato.getIdVendedor());
                    contratoToBeUpdate.setIdProduto(contrato.getIdProduto());
                    contratoToBeUpdate.setQuantidade(contrato.getQuantidade());
                    contratoToBeUpdate.setMoeda(contrato.getMoeda());
                    contratoToBeUpdate.setTipoContrato(contrato.getTipoContrato());
                    contratoToBeUpdate.setFormaPagamento(contrato.getFormaPagamento());
                    contratoToBeUpdate.setContratoPago(contrato.getContratoPago());
                    contratoRepository.save(contratoToBeUpdate);
                });
                return "contrato atualizado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "contrato não existe no banco.";
        }
    }

    @Transactional
    public String deleteContrato(Contrato contrato) {
        if (contratoRepository.existsByNomeContrato(contrato.getNomeContrato())) {
            try {
                List<Contrato> contratos = contratoRepository.findByNomeContrato(contrato.getNomeContrato());
                contratos.stream().forEach(s -> {
                    contratoRepository.delete(s);
                });
                return "contrato deletado.";
            } catch (Exception e) {
                throw e;
            }

        } else {
            return "contrato n\u00E3o existe no banco.";
        }
    }
}