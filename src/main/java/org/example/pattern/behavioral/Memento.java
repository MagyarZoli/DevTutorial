package org.example.pattern.behavioral;

import lombok.Data;
import lombok.NonNull;

@Data
public class Memento {

    private @NonNull String state;
}