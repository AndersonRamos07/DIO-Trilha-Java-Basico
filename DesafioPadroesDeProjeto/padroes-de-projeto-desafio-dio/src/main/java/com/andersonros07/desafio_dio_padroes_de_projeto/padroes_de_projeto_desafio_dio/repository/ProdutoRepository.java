package com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio.repository;

import com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Aqui podemos adicionar consultas customizadas, caso necessário
}
