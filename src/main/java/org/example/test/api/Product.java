package org.example.test.api;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private double price;

    @NonNull
    private int category_id;

    @NonNull
    private String category_name;
}