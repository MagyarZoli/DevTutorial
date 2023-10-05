package org.example.pattern.structural;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.pattern.auxiliary.User;

@Data
@EqualsAndHashCode(callSuper = true)
public class Bridge
        extends User {

    String name;

    public Bridge(String name) {
        this.name = name;
    }

    private User bridge(User user) {
        user.setName(name);
        return user;
    }
}