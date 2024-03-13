package com.grupo1.bancodigital.repository;

import com.grupo1.bancodigital.entity.cliente.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

}
