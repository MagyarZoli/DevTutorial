package org.example.pattern.auxiliary;

public class Driver {

    public void deliver(Document user) {
        if (user instanceof User) {
            User user1 = (User) user;
            System.out.println(user1.getName() + " Deliver!");
        } else if (user instanceof User2){
            User2 user2 = (User2) user;
            System.out.println(user2.getFirstName() + " Deliver!");
        } else {
            System.out.println("Deliver!");
        }
    }
}