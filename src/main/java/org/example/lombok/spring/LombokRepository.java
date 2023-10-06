package org.example.lombok.spring;

import org.example.lombok.pojo.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LombokRepository
        extends JpaRepository<Lombok, Long> {

    Optional<Lombok> findById(Long id);

    List<Lombok> findAllByName(String name);
}