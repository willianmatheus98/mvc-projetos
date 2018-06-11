package br.edu.unichristus.mvcprojetos.dados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unichristus.mvcprojetos.dados.entidades.Recurso;

@Repository
public interface RecursosRepository extends JpaRepository<Recurso, Long> {
	
	
}
