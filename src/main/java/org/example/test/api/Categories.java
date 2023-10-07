package org.example.test.api;

import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Categories {

    private int id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private Date created;

    @NonNull
    private Timestamp modified;
}