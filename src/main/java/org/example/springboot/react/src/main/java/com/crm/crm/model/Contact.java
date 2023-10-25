package org.example.springboot.react.src.main.java.com.crm.crm.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Contact {

    @Id
    @GeneratedValue
    public Long id;

    @NonNull
    public String firstName;

    @NonNull
    public String lastName;

    @NonNull
    public String email;
}