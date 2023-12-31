package com.apicomsqlite.poo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apicomsqlite.poo.enity.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

    public boolean existsByNomeContrato(String nome);

    public List<Contrato> findByNomeContrato(String nome);

    @Query("select max(s.id) from Contrato s")
    public Integer findMaxId();
}