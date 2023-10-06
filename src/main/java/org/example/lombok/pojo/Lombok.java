package org.example.lombok.pojo;

import jakarta.persistence.*;
import lombok.*;
import org.example.auxiliary.Gender;

@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Value
@Data
 @Entity
public class Lombok {

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @With
    @NonNull
    private String name;

    private byte age;

    @NonNull
    @Builder.Default
     @Enumerated(EnumType.ORDINAL)
    private Gender gender = Gender.MALE;

}