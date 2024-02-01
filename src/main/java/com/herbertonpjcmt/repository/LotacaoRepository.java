package com.herbertonpjcmt.repository;

import com.herbertonpjcmt.model.Lotacao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LotacaoRepository implements PanacheRepository<Lotacao> {

}
