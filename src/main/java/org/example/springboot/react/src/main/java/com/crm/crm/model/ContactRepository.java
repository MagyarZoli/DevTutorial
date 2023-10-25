package org.example.springboot.react.src.main.java.com.crm.crm.model;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository 
        extends CrudRepository<Contact, Long> {

    Contact save(Contact contact);

    @Override
    Collection<Contact> findAll();
}