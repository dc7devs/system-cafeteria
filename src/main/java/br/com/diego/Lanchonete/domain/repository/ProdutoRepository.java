package br.com.diego.Lanchonete.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.diego.Lanchonete.domain.templates.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
