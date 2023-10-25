package org.example.springboot.react.src.main.java.com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor_ = {@Autowired})
@Component
public class DemoLoader 
        implements CommandLineRunner {

    private final ContactRepository repository;

    @Override
    public void run(String... strings) 
            throws Exception {
        this.repository.save(new Contact("Zoltan", "Magyar", "me@me.com"));
    }
}