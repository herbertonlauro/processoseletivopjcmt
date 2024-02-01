package com.herbertonpjcmt.repository;

import com.herbertonpjcmt.model.Unidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UnidadeRepository implements PanacheRepository<Unidade> {

}
