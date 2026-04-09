package com.example.cadastro.service;

import com.example.cadastro.model.Pessoa;
import com.example.cadastro.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizar(Long id, Pessoa pessoa) {
        pessoa.setId(id);
        return repository.save(pessoa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}