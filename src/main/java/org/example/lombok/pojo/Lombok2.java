package org.example.lombok.pojo;

import jakarta.persistence.*;
import lombok.*;
import org.example.auxiliary.Gender;

@Builder
 @Entity
public record Lombok2(
        @ToString.Exclude
        @EqualsAndHashCode.Exclude
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @With
        @NonNull
        String name,
        byte age,
        @NonNull
        Gender gender) {}