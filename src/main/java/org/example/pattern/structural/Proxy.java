package org.example.pattern.structural;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.pattern.auxiliary.User;

import java.util.Random;

@EqualsAndHashCode(callSuper = true)
@Data
public class Proxy extends User {

    User user;

    public Proxy(User user) {
        this.user = user;
        check(user.getId());
    }

    public void check(Long id) {
        if (id == null) {
            id = new Random().nextLong(1, 100);
        }
        this.user.setId(id);
    }
}