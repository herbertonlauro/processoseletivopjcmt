package com.herbertonpjcmt.repository;

import com.herbertonpjcmt.model.ServidorTemporario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServidorTemporarioRepository implements PanacheRepository<ServidorTemporario> {

}