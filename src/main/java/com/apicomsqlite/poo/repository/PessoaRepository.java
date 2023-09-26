package com.apicomsqlite.poo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apicomsqlite.poo.enity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    public boolean existsByNomePessoa(String nome);

    public List<Pessoa> findByNomePessoa(String nome);

    @Query("select max(s.id) from Pessoa s")
    public Integer findMaxId();
}