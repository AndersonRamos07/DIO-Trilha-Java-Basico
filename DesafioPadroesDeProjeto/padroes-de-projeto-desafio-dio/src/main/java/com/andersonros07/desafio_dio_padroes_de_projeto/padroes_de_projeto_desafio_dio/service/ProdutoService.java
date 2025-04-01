package com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio.service;

import com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio.model.Produto;
import com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
