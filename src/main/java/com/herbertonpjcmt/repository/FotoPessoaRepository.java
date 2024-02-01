package com.herbertonpjcmt.repository;

import com.herbertonpjcmt.model.FotoPessoa;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FotoPessoaRepository implements PanacheRepository<FotoPessoa> {

}
