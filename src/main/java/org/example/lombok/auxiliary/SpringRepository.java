package org.example.lombok.auxiliary;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpringRepository
        extends JpaRepository<Pojo, Long> {

    Optional<Pojo> findById(Long id);

    List<Pojo> findAllByName(String name);
}